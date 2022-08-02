package com.github.delta.ln.elastic;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.base.CoordinatorRegistryCenter;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.github.delta.ln.elastic.job.LogJob;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobConfig {

    @Value("${zk.server.list}")
    private String serverList;

    @Value("${zk.namespace}")
    private String namespace;

    /**
     * ZK 注册中心
     * @return
     */
    @Bean
    public CoordinatorRegistryCenter coordinatorRegistryCenter() {
        //ZK 连接配置
        ZookeeperConfiguration zookeeperConfiguration = new ZookeeperConfiguration(serverList, namespace);
        zookeeperConfiguration.setSessionTimeoutMilliseconds(200);

        //初始化 ZK注册中心
        ZookeeperRegistryCenter zookeeperRegistryCenter = new ZookeeperRegistryCenter(zookeeperConfiguration);
        zookeeperRegistryCenter.init();

        return zookeeperRegistryCenter;
    }

    @Value("${job.log-job.name}")
    private String logJobName;

    @Value("${job.log-job.cron}")
    private String logJobCron;

    @Value("${job.log-job.sharding}")
    private Integer logJobSharding;

    /**
     * log任务
     * @param registryCenter
     * @return
     */
    @Bean("logJobScheduler")
    public JobScheduler LogJobScheduler(CoordinatorRegistryCenter registryCenter) {
        JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder(logJobName, logJobCron, logJobSharding).build();
        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration, LogJob.class.getCanonicalName());
        LiteJobConfiguration liteJobConfiguration = LiteJobConfiguration.newBuilder(simpleJobConfiguration).overwrite(true).build();

        JobScheduler jobScheduler = new JobScheduler(registryCenter, liteJobConfiguration);
        jobScheduler.init();

        return jobScheduler;
    }
}
