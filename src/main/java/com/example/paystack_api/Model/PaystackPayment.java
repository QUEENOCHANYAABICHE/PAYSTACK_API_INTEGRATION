package com.example.paystack_api.Model;

import com.example.paystack_api.enums.PricingPlanType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "paystack_payment")
public class PaystackPayment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinColumn(name = "user_id")
        private AppUser user;

        @Column(name = "reference")
        private String reference;

        @Column(name = "amount")
        private BigDecimal amount;

        @Column(name = "gateway_response")
        private String gatewayResponse;

        @Column(name = "paid_at")
        private String paidAt;

        @Column(name = "created_at")
        private String createdAt;

        @Column(name = "channel")
        private String channel;

        @Column(name = "currency")
        private String currency;

        @Column(name = "ip_address")
        private String ipAddress;

        @Column(name = "pricing_plan_type", nullable = false)
        @Enumerated(EnumType.STRING)
        private PricingPlanType pricingPlanType = PricingPlanType.BASIC;

        @CreationTimestamp
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "created_on", updatable = false, nullable = false)
        private Date createdOn;
    }


