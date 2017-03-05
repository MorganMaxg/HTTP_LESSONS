package com.maxg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 46513 on 2017/3/5.
 */
@RestController
@RequestMapping("/server")
public class ServerController {

    /**
     * get 服务
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Map<String, Object> getServer(){
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("code", 0);
        resMap.put("method", "get");
        return resMap;
    }

    /**
     * delete 服务
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Map<String, Object> deleteServer(){
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("code", 0);
        resMap.put("method", "delete");
        return resMap;
    }

    /**
     * post服务
     * @return
     */
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public Map<String, Object> postServer(){
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("code", 0);
        resMap.put("method", "post");
        return resMap;
    }

    /**
     * put服务
     * @return
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public Map<String, Object> putServer(){
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("code", 0);
        resMap.put("method", "put");
        return resMap;
    }
}
