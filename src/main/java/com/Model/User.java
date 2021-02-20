package com.Model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id",unique=true)
    private Long userId;
    private String userName;
    private String password;
    @Column(unique = true)
    private String eMail;

}
