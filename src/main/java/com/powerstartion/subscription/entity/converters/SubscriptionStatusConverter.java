package com.powerstartion.subscription.entity.converters;

import com.powerstartion.subscription.entity.enums.SubscriptionStatus;

import javax.persistence.AttributeConverter;

public class SubscriptionStatusConverter implements AttributeConverter<SubscriptionStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(SubscriptionStatus subscriptionStatus) {

        if (subscriptionStatus == null)
            return null;

        switch (subscriptionStatus) {
            case ACTIVE:
                return 0;
            case BLOCKED:
                return 1;
            case SUSPENDED:
                return 10;
            default:
                throw new IllegalArgumentException(subscriptionStatus + "Not supported");
        }

    }

    @Override
    public SubscriptionStatus convertToEntityAttribute(Integer status) {
        if (status == null)
            return null;

        switch (status) {

            case 0:
                return SubscriptionStatus.ACTIVE;
            case 1:
                return SubscriptionStatus.BLOCKED;
            case 10:
                return SubscriptionStatus.SUSPENDED;
            default:
                throw new IllegalArgumentException(status + " not supported");
        }
    }

}
