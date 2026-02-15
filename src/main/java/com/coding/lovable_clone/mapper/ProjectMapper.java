package com.coding.lovable_clone.mapper;

import com.coding.lovable_clone.dto.project.ProjectResponse;
import com.coding.lovable_clone.dto.project.ProjectSummaryResponse;
import com.coding.lovable_clone.entities.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    //ProjectEntity to ProjectResponse DTO Conversion
    ProjectResponse toProjectResponse(Project project);

//    @Mapping(target = "projectName", source = "name")
//    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    //List of ProjectEntity to List of ProjectResponse DTO Conversion
    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);
}
