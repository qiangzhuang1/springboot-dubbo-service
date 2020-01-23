package com.springboot.dubbo.provider;

import com.springboot.dubbo.demo.LoginService;
import org.apache.dubbo.config.annotation.Service;
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(String userName, String pwd) {
        if (userName.equals("admin") && pwd.equals("admin")) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}
