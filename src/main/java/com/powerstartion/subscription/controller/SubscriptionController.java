package com.powerstartion.subscription.controller;

import com.powerstartion.subscription.dto.SubscriptionDTO;
import com.powerstartion.subscription.entity.Subscription;
import com.powerstartion.subscription.service.SubscriptionService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SubscriptionController {

    @Autowired
    SubscriptionService subscriptionService;

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/subscriptions/{userName}")
    public ResponseEntity<SubscriptionDTO> getSubscription(@PathVariable String userName) {

        logger.info("userName "+userName);
        Subscription subscription;
        subscription = subscriptionService.getSubscriptionByUserName(userName);
        logger.info("subscription "+subscription.toString());
        ModelMapper modelMapper = new ModelMapper();
        SubscriptionDTO subscriptionDTO = modelMapper.map(subscription, SubscriptionDTO.class);
        ResponseEntity<SubscriptionDTO> responseEntity = new ResponseEntity<>(subscriptionDTO, HttpStatus.OK);

        return responseEntity;
    }


}
