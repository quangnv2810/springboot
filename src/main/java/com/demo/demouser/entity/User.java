package com.demo.demouser.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

/**
 * @author declan.nguyen
 * @version 1.0
 * @created 6/23/2022 3:59 PM
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue
    Long id;

    String name;

    Long userPermissionId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude
    @JoinTable(name = "user_permission", //Tạo ra một join Table tên là "address_person"
            joinColumns = @JoinColumn(name = "user_id"),  // TRong đó, khóa ngoại chính là address_id trỏ tới class hiện tại (Address)
            inverseJoinColumns = @JoinColumn(name = "permission_id") //Khóa ngoại thứ 2 trỏ tới thuộc tính ở dưới (Person)
    )
    List<Permission> permissions;
}
