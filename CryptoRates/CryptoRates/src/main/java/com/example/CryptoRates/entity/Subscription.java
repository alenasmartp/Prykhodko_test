package com.example.CryptoRates.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String assetsId;
    private Date timeInterval;

    @ManyToOne(
             fetch = FetchType.LAZY,
             optional = false
    )
@JsonIgnore
    private User user;

    public void add(Subscription subscription) {
    }
}
