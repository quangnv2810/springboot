package com.demo.demouser.service.user;

import com.demo.demouser.dto.UserDTO;
import com.demo.demouser.entity.User;

import java.util.List;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:14 PM
 */
public interface IUserService {

    Long createUser(UserDTO userDTO);

    List<User> getAllUser();
}
