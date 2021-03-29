package com.powerstartion.subscription.service;

import com.powerstartion.subscription.dto.SubscriptionDTO;
import com.powerstartion.subscription.entity.Subscription;
import com.powerstartion.subscription.repository.SubscriptionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SubscriptionRepository subscriptionRepository;

    public SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository){
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public SubscriptionDTO saveSubscription(Subscription subscription) {
        subscriptionRepository.save(subscription);
        return null;
    }

    @Override
    public Subscription getSubscriptionByUserName(String userName) {
        logger.info("trying get subscription SubscriptionService "+userName);
        return subscriptionRepository.findSubscriptionByUsername(userName);
    }
}
