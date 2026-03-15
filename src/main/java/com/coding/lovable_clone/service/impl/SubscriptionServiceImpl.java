package com.coding.lovable_clone.service.impl;

import com.coding.lovable_clone.dto.subscription.CheckoutRequest;
import com.coding.lovable_clone.dto.subscription.CheckoutResponse;
import com.coding.lovable_clone.dto.subscription.PortalResponse;
import com.coding.lovable_clone.dto.subscription.SubscriptionResponse;
import com.coding.lovable_clone.entities.Subscription;
import com.coding.lovable_clone.enums.SubscriptionStatus;
import com.coding.lovable_clone.mapper.SubscriptionMapper;
import com.coding.lovable_clone.repository.PlanRepository;
import com.coding.lovable_clone.repository.ProjectMemberRepository;
import com.coding.lovable_clone.repository.SubscriptionRepository;
import com.coding.lovable_clone.repository.UserRepository;
import com.coding.lovable_clone.security.AuthUtil;
import com.coding.lovable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    private final AuthUtil authUtil;
    private final SubscriptionRepository subscriptionRepository;
    private final SubscriptionMapper subscriptionMapper;
    private final UserRepository userRepository;
    private final PlanRepository planRepository;
    private final ProjectMemberRepository projectMemberRepository;

    @Override
    public SubscriptionResponse getCurrentSubscription() {
        Long userId = authUtil.getCurrentUserId();

        var currentSubscription = subscriptionRepository.findByUserIdAndStatusIn(userId, Set.of(
                SubscriptionStatus.ACTIVE, SubscriptionStatus.PAST_DUE,
                SubscriptionStatus.TRIALING
        )).orElse(
                new Subscription()
        );

        return subscriptionMapper.toSubscriptionResponse(currentSubscription);
    }


}
