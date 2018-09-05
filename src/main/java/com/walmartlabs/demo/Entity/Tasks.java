package com.walmartlabs.demo.Entity;

import org.hibernate.annotations.Formula;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;

    private Date startdate;

    private Date enddate;

    private Integer priority;

    private Integer isrepeated;

    private Integer status;

    @Formula(value = "case when status = \"0\" then \"Started\" when status = \"1\" then \"Pending\" when status = \"2\" then \"Finished\" end")
    private String taskStatus;

    @Formula(value = "DATEDIFF(enddate, startdate)")
    private Integer days;

    @Formula(value = "DATE_FORMAT(startDate,'%m/%d/%Y')")
    private String formatedStartDate;

    @Formula(value = "DATE_FORMAT(enddate,'%m/%d/%Y')")
    private String formatedEndDate;

    public Tasks() {

    }

    public Tasks(Date startdate, Date enddate, Integer priority, Integer isrepeated, Integer status) {
        this.startdate = startdate;
        this.enddate = enddate;
        this.priority = priority;
        this.isrepeated = isrepeated;
        this.status = status;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public java.util.Date getStartdate() {
        return startdate;
    }

    public void setStartdate(java.util.Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getIsrepeated() {
        return isrepeated;
    }

    public void setIsrepeated(Integer isrepeated) {
        this.isrepeated = isrepeated;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getFormatedStartDate() {
        return formatedStartDate;
    }

    public void setFormatedStartDate(String formatedStartDate) {
        this.formatedStartDate = formatedStartDate;
    }

    public String getFormatedEndDate() {
        return formatedEndDate;
    }

    public void setFormatedEndDate(String formatedEndDate) {
        this.formatedEndDate = formatedEndDate;
    }

}
