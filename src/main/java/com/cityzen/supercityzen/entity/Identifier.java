package com.cityzen.supercityzen.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Identifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideId;

    @NotBlank
    @Length(min = 1, max = 20)
    @Column(unique = true)
    private String login;

    private boolean isUsed = false;

    @OneToOne(mappedBy = "identifier", cascade = CascadeType.ALL)
    private User user;
}
