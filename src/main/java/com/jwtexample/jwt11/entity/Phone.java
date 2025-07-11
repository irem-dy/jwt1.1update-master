package com.jwtexample.jwt11.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "phone")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Phone_id")
    private Long PhoneId;

    @Column(name = "phone")
    private String phone;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"phone", "hibernateLazyInitializer"})
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    public Phone(String phone, User user) {
        this.phone = phone;
        this.user = user;
    }
}