package com.coding.lovable_clone.service.impl;

import com.coding.lovable_clone.dto.member.InviteMemberRequest;
import com.coding.lovable_clone.dto.member.MemberResponse;
import com.coding.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.coding.lovable_clone.mapper.ProjectMemberMapper;
import com.coding.lovable_clone.repository.ProjectMemberRepository;
import com.coding.lovable_clone.repository.ProjectRepository;
import com.coding.lovable_clone.repository.UserRepository;
import com.coding.lovable_clone.security.AuthUtil;
import com.coding.lovable_clone.service.ProjectMemberService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Transactional
public class ProjectMemberServiceImpl implements ProjectMemberService {

    ProjectMemberRepository projectMemberRepository;
    ProjectRepository projectRepository;
    ProjectMemberMapper projectMemberMapper;
    UserRepository userRepository;
    AuthUtil authUtil;

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
