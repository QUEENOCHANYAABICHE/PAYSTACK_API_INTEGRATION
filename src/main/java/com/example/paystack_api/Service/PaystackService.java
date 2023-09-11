package com.example.paystack_api.Service;

import com.example.paystack_api.Dto.CreatePlanDto;
import com.example.paystack_api.Dto.InitializePaymentDto;
import com.example.paystack_api.Response.CreatePlanResponse;
import com.example.paystack_api.Response.InitializePaymentResponse;
import com.example.paystack_api.Response.PaymentVerificationResponse;

public interface PaystackService {
    CreatePlanResponse createPlan(CreatePlanDto createPlanDto);

    InitializePaymentResponse initializePayment(InitializePaymentDto initializePaymentDto);

    PaymentVerificationResponse paymentVerification(String reference, String plan, Long id);
}
