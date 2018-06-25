package com.hskj.service;

import com.hskj.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by hongHan_gao
 * Date: 2018/4/3
 */

@Service
public class UserService {

    @Value("${server.port}")
    private String port;

    public User getUSerInfo(Integer id){
        User user = new User(id, "Tom", 30, port);
        return user;
    }

}
