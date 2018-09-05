package com.walmartlabs.demo.Repository;

import com.walmartlabs.demo.Entity.Tasks;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends PagingAndSortingRepository<Tasks, Long> {

    //Page<Tasks> findAllPageable(Pageable pageable);

    Iterable<Tasks> save(Iterable<Tasks> tasks);
}
