package com.cityzen.supercityzen.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer catId;

    @NotNull
    @NotBlank
    @Length(min = 3, max = 100)
    private String title;

    @NotNull
    @NotBlank
    @Length(min = 3, max = 1000)
    private String description;

    @ManyToMany(mappedBy = "listCategories", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Idea> listIdeas;
}
