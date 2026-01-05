package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "User name must not be blank")
    @Size(max = 20)
    private String userName;

    @NotBlank(message = "Email must not be blank")
    @Size(max = 50)
    private String email;

    @NotBlank(message = "Password must not be blank")
    @Size(max = 120)
    private String password;
}
