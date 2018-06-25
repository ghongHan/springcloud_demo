package com.hskj.service;

import com.hskj.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hongHan_gao
 * Date: 2018/4/3
 */

@Service
public class OrderService {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    public User getFirstServiceUser(Integer id){
        System.out.println("调用core_service服务");
        return restTemplate.getForObject("http://core-service-provider/user/" + id, User.class);
    }

}
