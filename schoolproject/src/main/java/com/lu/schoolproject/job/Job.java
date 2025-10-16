package com.lu.schoolproject.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public abstract class Job {
    public abstract void execute(JobExecutionContext context) throws JobExecutionException;
}
