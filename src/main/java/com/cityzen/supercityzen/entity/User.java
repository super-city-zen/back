package com.cityzen.supercityzen.entity;

import com.cityzen.supercityzen.util.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer useId;

    @NotBlank
    @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$")
    private String password;

    @Length(min = 2, max = 50)
    @NotBlank
    private String firstName;

    @Length(min = 2, max = 50)
    @NotBlank
    private String lastName;

    @NotBlank
    @Pattern(regexp = "^((([!#$%&'*+\\-/=?^_`{|}~\\w])|([!#$%&'*+\\-/=?^_`{|}~\\w][!#$%&'*+\\-/=?^_`{|}~\\.\\w]{0,}[!#$%&'*+\\-/=?^_`{|}~\\w]))[@]\\w+([-.]\\w+)*\\.\\w+([-.]\\w+]*)$")
    @Column(unique = true)
    private String email;

    @Length(min = 10, max = 50)
    @NotBlank
    private String address;

    @PastOrPresent
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdAt;

    @NotBlank
    @Length(min = 10, max = 200)
    private String imagePath;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ideId")
    private Identifier identifier;

    @ElementCollection(targetClass = Roles.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "useId"))
    @Enumerated(EnumType.STRING)
    private List<Roles> listRoles;

    @ManyToOne
    @JoinColumn(name = "votId")
    private Vote vote;

    @ManyToOne
    @JoinColumn(name = "proId")
    private Project project;

    @OneToMany(mappedBy = "user")
    private Set<Idea> listIdeas=new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Discussion> listDiscussions=new HashSet<>();
}
