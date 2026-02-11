package com.coding.lovable_clone.service;

import com.coding.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.coding.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {

    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);

}
