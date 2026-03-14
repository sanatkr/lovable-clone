package com.coding.lovable_clone.mapper;

import com.coding.lovable_clone.dto.subscription.PlanResponse;
import com.coding.lovable_clone.dto.subscription.SubscriptionResponse;
import com.coding.lovable_clone.entities.Plan;
import com.coding.lovable_clone.entities.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);

}
