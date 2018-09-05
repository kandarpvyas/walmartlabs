package com.walmartlabs.demo.ServiceImpl;

import com.walmartlabs.demo.Entity.Tasks;
import com.walmartlabs.demo.Repository.TasksRepository;
import com.walmartlabs.demo.Service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TasksServiceImpl implements TasksService {

    private TasksRepository tasksRepository;

    @Autowired
    public TasksServiceImpl(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    public Page<Tasks> findAllPageable(Pageable pageable) {
        return tasksRepository.findAll(pageable);
    }

    @Override
    public Iterable<Tasks> save(Iterable<Tasks> tasks) {
        return tasksRepository.saveAll(tasks);
    }

}
