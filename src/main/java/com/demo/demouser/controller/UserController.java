package com.demo.demouser.controller;

import com.demo.demouser.constants.PermissionEnum;
import com.demo.demouser.dto.UserDTO;
import com.demo.demouser.entity.User;
import com.demo.demouser.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:06 PM
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/create")
    public ResponseEntity<Long> createUser(@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userDTO));
    }

    @GetMapping("/get_user_info")
    public ResponseEntity<Set<User>> createUser(@RequestHeader(value = "permission") PermissionEnum permissionEnum) {
        return ResponseEntity.ok().body(userService.getAllUserByPermission(permissionEnum));
    }
}
