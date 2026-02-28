package com.coding.lovable_clone.mapper;

import com.coding.lovable_clone.dto.auth.SignupRequest;
import com.coding.lovable_clone.dto.auth.UserProfileResponse;
import com.coding.lovable_clone.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);
}
