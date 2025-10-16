package com.lu.schoolproject.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class DynamicJob extends Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String jobName = context.getJobDetail().getKey().getName();
        System.out.println("动态任务执行：" + jobName + " - " + System.currentTimeMillis());
    }
}
