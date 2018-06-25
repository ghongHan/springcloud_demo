package com.hskj.domain;

import java.io.Serializable;

/**
 * Created by hongHan_gao
 * Date: 2018/4/3
 */


public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private String port;

    //必须要有
    public User(){}

    public User(Integer id, String name, Integer age, String port){
        this.id = id;
        this.name = name;
        this.age = age;
        this.port = port;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}
