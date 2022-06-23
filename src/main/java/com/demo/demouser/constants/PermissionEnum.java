package com.demo.demouser.constants;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 5:49 PM
 */
public enum PermissionEnum {

    ADMIN(1L),
    USER(2L),
    DEV(3L);

    private Long id;

    PermissionEnum(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
