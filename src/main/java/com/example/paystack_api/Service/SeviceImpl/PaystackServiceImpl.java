package com.example.paystack_api.Service.SeviceImpl;

import com.example.paystack_api.Dto.CreatePlanDto;
import com.example.paystack_api.Dto.InitializePaymentDto;
import com.example.paystack_api.Response.CreatePlanResponse;
import com.example.paystack_api.Response.InitializePaymentResponse;
import com.example.paystack_api.Response.PaymentVerificationResponse;
import com.example.paystack_api.Service.PaystackService;
import org.springframework.stereotype.Service;

@Service
public class PaystackServiceImpl implements PaystackService {
    @Override
    public CreatePlanResponse createPlan(CreatePlanDto createPlanDto) {
        return null;
    }

    @Override
    public InitializePaymentResponse initializePayment(InitializePaymentDto initializePaymentDto) {
        return null;
    }

    @Override
    public PaymentVerificationResponse paymentVerification(String reference, String plan, Long id) {
        return null;
    }
}
