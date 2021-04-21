package ru.javaops.bootjava.model;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private Set<Role> roles;
}