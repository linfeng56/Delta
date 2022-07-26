package com.github.delta.ln.elastic.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class LogJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("execute log-job ......");
    }
}
