package com.coding.lovable_clone.security;

import com.coding.lovable_clone.enums.ProjectPermission;
import com.coding.lovable_clone.repository.ProjectMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component("security")
@RequiredArgsConstructor
public class SecurityExpressions {

    private final ProjectMemberRepository projectMemberRepository;
    private final AuthUtil authUtil;

    private boolean hasPermission(Long projectId, ProjectPermission projectPermission) {
        Long userId = authUtil.getCurrentUserId();

        return projectMemberRepository.findRoleByProjectIdAndUserId(projectId, userId).
                map(role -> role.getPermissions().contains(projectPermission))
                .orElse(false);
    }
}
