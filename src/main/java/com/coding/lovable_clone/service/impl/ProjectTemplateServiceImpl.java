package com.coding.lovable_clone.service.impl;

import com.coding.lovable_clone.entities.Project;
import com.coding.lovable_clone.error.ResourceNotFoundException;
import com.coding.lovable_clone.repository.ProjectRepository;
import com.coding.lovable_clone.service.ProjectTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ProjectTemplateServiceImpl implements ProjectTemplateService {

    private final ProjectRepository projectRepository;

    @Override
    public void initializeProjectFromTemplate(Long projectId) {
        Project project = projectRepository.findById(projectId).orElseThrow(
                () -> new ResourceNotFoundException("Project", projectId.toString()));
    }
}
