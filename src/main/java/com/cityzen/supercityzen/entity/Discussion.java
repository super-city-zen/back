package com.cityzen.supercityzen.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer disId;

    @NotBlank
    @Length(min = 3, max = 100)
    private String message;

    @PastOrPresent
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdAt;

    private boolean isHide;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_discussion_id")
    private Discussion respondsTo;

    @OneToMany(mappedBy = "respondsTo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Discussion> listDiscussions=new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idea_id")
    private Idea idea;
}
