package com.imain.dubbodemo.provider.dservice;

import com.imain.dubbodemo.api.UserApi;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author Songrui.Liu
 * date 2019/11/611:57
 */
@Service(version = "1.0")
public class UserService implements UserApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public String index(String name) {
        LOGGER.info("" + name);
        return "hello " + name;
    }

}
