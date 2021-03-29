package com.powerstartion.subscription.dto;

import com.powerstartion.subscription.entity.converters.SubscriptionStatusConverter;
import com.powerstartion.subscription.entity.enums.SubscriptionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Data
public class SubscriptionDTO {

        private int id;
        private SubscriptionStatus status;
        private String username;
        private String name;
        private String surname;
        private Date dateOfBirth;
        private Instant creationDate;

}
