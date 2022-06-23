package com.demo.demouser.constants;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 5:49 PM
 */
public enum PermissionEnum {

    ADMIN("admin"),
    USER("user"),
    DEV("dev");

    private String name;

    PermissionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String name) {
        this.name = name;
    }
}
