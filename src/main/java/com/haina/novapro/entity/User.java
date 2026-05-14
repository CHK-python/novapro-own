package com.haina.novapro.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.yaml.snakeyaml.events.Event;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(unique = true,nullable = false,length = 50)
    private String username;

    @Column(nullable = false)
    private String password;

    private String nickname;

    private String avatar;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

}
