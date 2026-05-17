package com.coding.lovable_clone.service;

import com.coding.lovable_clone.dto.subscription.CheckoutRequest;
import com.coding.lovable_clone.dto.subscription.CheckoutResponse;
import com.coding.lovable_clone.dto.subscription.PortalResponse;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);

}
