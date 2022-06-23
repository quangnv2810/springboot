package com.demo.demouser.repository;

import com.demo.demouser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:20 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
