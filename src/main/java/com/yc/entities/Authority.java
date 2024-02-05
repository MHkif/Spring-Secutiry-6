package com.yc.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity()
@Data
@Table(name = "authority")
public class Authority {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;
}
