package com.jd.domain;

import java.io.Serializable;

public class Request implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
