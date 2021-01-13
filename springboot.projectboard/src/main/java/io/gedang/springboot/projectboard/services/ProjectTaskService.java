package io.gedang.springboot.projectboard.services;

import io.gedang.springboot.projectboard.domain.ProjectTask;
import io.gedang.springboot.projectboard.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){
        if(projectTask.getStatus()==null || projectTask.getStatus()==""){
            projectTask.setStatus("TO_DO");
        }
        return projectTaskRepository.save(projectTask);
    }
}
