package com.coding.lovable_clone.service;

import com.coding.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {

    UserProfileResponse getProfile(Long userId);
}
