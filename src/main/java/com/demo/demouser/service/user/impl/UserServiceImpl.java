package com.demo.demouser.service.user.impl;

import com.demo.demouser.dto.UserDTO;
import com.demo.demouser.entity.User;
import com.demo.demouser.repository.UserRepository;
import com.demo.demouser.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:16 PM
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long createUser(UserDTO userDTO) {
        User u = new User();
        u.setUserPermissionId(userDTO.getPermission().getId());
        u.setName(userDTO.getName());
        return userRepository.save(u).getId();
    }

    @Override
    public List<User> getAllUser() {
        return Collections.emptyList();
    }
}
