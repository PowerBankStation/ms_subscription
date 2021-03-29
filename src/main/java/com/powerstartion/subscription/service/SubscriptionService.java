package com.powerstartion.subscription.service;

import com.powerstartion.subscription.dto.SubscriptionDTO;
import com.powerstartion.subscription.entity.Subscription;

public interface SubscriptionService {

SubscriptionDTO saveSubscription(Subscription subscription);

Subscription getSubscriptionByUserName(String userName);

}
