package com.example.paystack_api.Service.SeviceImpl;

import com.example.paystack_api.Dto.CreatePlanDto;
import com.example.paystack_api.Dto.InitializePaymentDto;
import com.example.paystack_api.Repository.AppUserRepository;
import com.example.paystack_api.Repository.PaystackPaymentRepository;
import com.example.paystack_api.Response.CreatePlanResponse;
import com.example.paystack_api.Response.InitializePaymentResponse;
import com.example.paystack_api.Response.PaymentVerificationResponse;
import com.example.paystack_api.Service.PaystackService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaystackServiceImpl implements PaystackService {

    private final PaystackPaymentRepository paystackPaymentRepository;
    private final AppUserRepository appUserRepository;

    @Value("${applyforme.paystack.secret.key}")
    private String paystackSecretKey;

    public PaystackServiceImpl(PaystackPaymentRepository paystackPaymentRepository, AppUserRepository appUserRepository) {
        this.paystackPaymentRepository = paystackPaymentRepository;
        this.appUserRepository = appUserRepository;
    }

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
