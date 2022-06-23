package com.demo.demouser.service.user.impl;

import com.demo.demouser.constants.MessageConstant;
import com.demo.demouser.constants.PermissionEnum;
import com.demo.demouser.dto.UserDTO;
import com.demo.demouser.entity.Permission;
import com.demo.demouser.entity.User;
import com.demo.demouser.entity.UserPermission;
import com.demo.demouser.repository.PermissionRepository;
import com.demo.demouser.repository.UserPermissionRepository;
import com.demo.demouser.repository.UserRepository;
import com.demo.demouser.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:16 PM
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private UserPermissionRepository userPermissionRepository;

    @Override
    @Transactional
    public Long createUser(UserDTO userDTO) {
        //create user
        User u = new User();
        u.setName(userDTO.getName());
        Long userId = userRepository.save(u).getId();

        //get permission
        Optional<Permission> permission = permissionRepository.findByName(userDTO.getPermission().getName());
        if (!permission.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, MessageConstant.PERMISSION_NOT_FOUND);
        }

        //create user permission
        UserPermission userPermission = new UserPermission();
        userPermission.setUserId(userId);
        userPermission.setPermissionId(permission.get().getId());
        userPermissionRepository.save(userPermission);

        return userId;
    }

    @Override
    public Set<User> getAllUserByPermission(PermissionEnum permissionEnum) {
        //get permission
        Optional<Permission> permission = permissionRepository.findByName(permissionEnum.getName());
        if (!permission.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, MessageConstant.PERMISSION_NOT_FOUND);
        }
        return permission.get().getUsers();
    }
}
