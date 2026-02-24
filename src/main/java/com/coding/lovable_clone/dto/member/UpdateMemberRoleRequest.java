package com.coding.lovable_clone.dto.member;

import com.coding.lovable_clone.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(

        @NotNull
        ProjectRole role
) {
}
