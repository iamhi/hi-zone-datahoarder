package com.github.iamhi.hizone.datahoarder.data.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    long id;

    @Column(name = "uuid")
    String uuid = UUID.randomUUID().toString();

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "email")
    String email;

    @Column(name = "roles")
    String roles;

    @Column(name = "created_at")
    Instant createdAt = Instant.now();

    @Column(name = "updated_at")
    Instant updatedAt = Instant.now();
}
