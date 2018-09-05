package com.walmartlabs.demo.Service;

import com.walmartlabs.demo.Entity.Tasks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TasksService {

    Page<Tasks> findAllPageable(Pageable pageable);

    Iterable<Tasks> save(Iterable<Tasks> tasks);
}