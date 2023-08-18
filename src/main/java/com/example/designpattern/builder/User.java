package com.example.designpattern.builder;

import lombok.Getter;

@Getter   //only getter, no setter
public class User {
    //mandatory
    private String name;
    private String nid;

    //optional
    private String phoneNumber;
    private String email;
    private String address;
}
