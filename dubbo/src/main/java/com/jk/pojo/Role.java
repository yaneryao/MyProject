package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private String id;
    private String name;
}
