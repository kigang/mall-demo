package com.example.security.infra.component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *  定时任务实例
 * @author qigang.qin@hand-china.com 2021/6/2 9:22
 */
@Component
public class SpringTask {


    private Logger logger = LoggerFactory.getLogger(SpringTask.class);

    @Scheduled(cron = "0,30 * * * * ?")
    private void taskOne() {
        logger.info("定时任务处理逻辑");
    }
}
