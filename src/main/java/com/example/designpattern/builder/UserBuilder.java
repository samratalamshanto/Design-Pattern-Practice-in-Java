package com.example.designpattern.builder;

import lombok.Setter;

@Setter
public class UserBuilder {
    //mandatory
    private String name;
    private String nid;

    //optional
    private String phoneNumber;
    private String email;
    private String address;

    public UserBuilder(String name, String nid) {
        this.name = name;
        this.nid = nid;
    }

}
