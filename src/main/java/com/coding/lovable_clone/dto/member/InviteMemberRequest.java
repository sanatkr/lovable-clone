package com.coding.lovable_clone.dto.member;

import com.coding.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
