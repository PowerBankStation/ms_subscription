package com.powerstartion.subscription.repository;

import com.powerstartion.subscription.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

    Subscription findSubscriptionByUsername(String userName);
}
