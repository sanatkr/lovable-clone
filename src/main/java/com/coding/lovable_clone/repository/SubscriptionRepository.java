package com.coding.lovable_clone.repository;

import com.coding.lovable_clone.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
