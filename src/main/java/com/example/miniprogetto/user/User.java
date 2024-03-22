package com.example.miniprogetto.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String userName;
    private String email;
    private String password;
}
