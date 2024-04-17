package com.security.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="student")


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String passWord;
    
}
