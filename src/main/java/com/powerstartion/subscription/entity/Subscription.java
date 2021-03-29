package com.powerstartion.subscription.entity;

import com.powerstartion.subscription.entity.converters.SubscriptionStatusConverter;
import com.powerstartion.subscription.entity.enums.SubscriptionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Data
@Table(name="subscriptions")
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {

    @Id
    @Column
    private int id;

    @Convert(converter = SubscriptionStatusConverter.class)
    private SubscriptionStatus status;

    private String username;

    private String name;

    private String surname;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "creation_date")
    private Instant creationDate;

}
