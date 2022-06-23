package com.demo.demouser.repository;

import com.demo.demouser.entity.Permission;
import com.demo.demouser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:20 PM
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Optional<Permission> findByName(String name);
}
