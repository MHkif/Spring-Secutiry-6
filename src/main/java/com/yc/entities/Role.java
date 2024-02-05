package com.yc.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity()
@Data
@Table(name = "role")
public class Role {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @ManyToMany(fetch = FetchType.EAGER)
    List<Authority> authorities;
}
