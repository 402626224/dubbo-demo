package com.imain.dubbodemo.consumer.web;

import com.imain.dubbodemo.api.UserApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author Songrui.Liu
 * date 2019/11/613:28
 */
@RestController
public class IndexController {

    @Reference(version = "1.0")
    private UserApi userApi;

    @RequestMapping("/")
    private String index() {
        return userApi.index("imain");
    }

}
