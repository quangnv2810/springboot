package com.demo.demouser.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 4:00 PM
 */
@Entity
@Table(name = "permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Permission {

    @Id
    @GeneratedValue
    Long id;

    String name;
}
