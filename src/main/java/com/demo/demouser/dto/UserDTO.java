package com.demo.demouser.dto;

import com.demo.demouser.constants.PermissionEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:15 PM
 */
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDTO {

    String name;
    PermissionEnum permission;
}
