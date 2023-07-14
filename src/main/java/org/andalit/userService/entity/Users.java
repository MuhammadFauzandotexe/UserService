package org.andalit.userService.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.generator.internal.CurrentTimestampGeneration;

@Data
@Entity
@Table(name = "user_register")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "is_registered")
    private String isRegistered;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "sha256_hash")
    private String sha256Hash;
    @Column(name = "created_at")
    private CurrentTimestampGeneration createdAt;
    @Column(name = "updated_at")
    private CurrentTimestampGeneration updatedAt;
}
