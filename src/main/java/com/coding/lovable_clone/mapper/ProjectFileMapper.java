package com.coding.lovable_clone.mapper;

import com.coding.lovable_clone.dto.project.FileNode;
import com.coding.lovable_clone.entities.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);

}
