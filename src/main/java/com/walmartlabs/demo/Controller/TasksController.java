package com.walmartlabs.demo.Controller;

import com.walmartlabs.demo.Entity.Tasks;
import com.walmartlabs.demo.Service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class TasksController {

    @Autowired
    TasksService tasksService;

    @RequestMapping(value = "/tasksList", method = RequestMethod.GET)
    public String showTasksListPage(ModelMap model) {
        return "tasks";
    }

    @SuppressWarnings("deprecation")
    @ResponseBody
    @RequestMapping(value = "/page/{page}/size/{size}", method = RequestMethod.GET)
    public Page<Tasks> getPersons(@PathVariable("page") int page, @PathVariable("size") int size) {
        PageRequest pageRequest = new PageRequest(page - 1, size, Direction.ASC, "status", "days");
        return tasksService.findAllPageable(pageRequest);
    }

    @RequestMapping(value = "/createTask", method = RequestMethod.GET)
    public String showCreateTaskPage(ModelMap model) {
        return "create";
    }

    @RequestMapping(value = "/" , method = RequestMethod.POST)
    public String createTask()
    {
        return null;
    }

}
