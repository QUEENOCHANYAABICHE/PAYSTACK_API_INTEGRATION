package com.example.paystack_api.Repository;


import com.example.paystack_api.Model.PaystackPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaystackPaymentRepository extends JpaRepository<PaystackPayment, Long> {
}


