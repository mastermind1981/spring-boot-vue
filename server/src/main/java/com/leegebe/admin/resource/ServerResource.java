package com.leegebe.admin.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class ServerResource {

    @Value("${spring.application.name}")
    private String serverName;

    @RequestMapping("/info")
    public Object getInfo() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", serverName);
        return result;
    }

}
