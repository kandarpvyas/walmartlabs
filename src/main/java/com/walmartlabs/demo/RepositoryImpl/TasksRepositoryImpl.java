package com.walmartlabs.demo.RepositoryImpl;

import com.walmartlabs.demo.Entity.Tasks;
import com.walmartlabs.demo.Repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TasksRepositoryImpl {

    @Autowired
    private TasksRepository tasksRepository;

    /*
     * public Page<Tasks> findAllPageable(Pageable pageable) { return
     * tasksRepository.findAll(pageable); }
     */

    public Iterable<Tasks> save(Iterable<Tasks> tasks) {
        return tasksRepository.saveAll(tasks);
    }
	
	/*public Iterable<Tasks>  findAllSortRecord()
	{
		
	}*/

}

