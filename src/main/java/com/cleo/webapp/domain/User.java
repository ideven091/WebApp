package com.cleo.webapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String fullName;
    private String password;
    private long expense;

     Set<String> friends;

}
