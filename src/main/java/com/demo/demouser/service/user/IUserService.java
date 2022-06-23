package com.demo.demouser.service.user;

import com.demo.demouser.constants.PermissionEnum;
import com.demo.demouser.dto.UserDTO;
import com.demo.demouser.entity.User;

import java.util.List;
import java.util.Set;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:14 PM
 */
public interface IUserService {

    /**
     * create new user
     * @param userDTO user info
     * @return id user created
     */
    Long createUser(UserDTO userDTO);

    Set<User> getAllUserByPermission(PermissionEnum permissionEnum);
}
