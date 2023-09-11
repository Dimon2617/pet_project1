package com.example.pet_project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String buyer_name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "orders",orphanRemoval = true)
    private List<Goods> goods;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
