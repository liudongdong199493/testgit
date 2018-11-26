package com.baizhi.testgit.entity;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("llll");
        user.getUsername();
    }


}
