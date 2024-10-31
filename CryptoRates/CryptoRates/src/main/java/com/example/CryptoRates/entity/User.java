package com.example.CryptoRates.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private boolean isAdmin;
    private Date create_at;
    private boolean isActive;

    @OneToMany(
            mappedBy = "user",
            fetch = FetchType.EAGER
    )
    private  Set<Subscription> subscriptions = new HashSet<>();

    public void addSubscription(Subscription subscription) {
        subscription.add(subscription);
        subscription.getUser().add(this);
    }

    private void add(User user) {
    }

//    public void removeSubscription(long SubscriptionId) {
//        Subscription card = subscriptions.stream()
//                .filter(c -> c.getId().equals(subscriptionId)).findFirst().orElse(null);
//        if (subscription != null) {
//            subscriptions.remove(subscription);
//            subscription.geUser().remove(this);
//        }
    }

