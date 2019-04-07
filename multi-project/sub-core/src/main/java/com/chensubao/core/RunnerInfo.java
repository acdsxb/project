package com.chensubao.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @author chensubao
 * @date 2019/4/7 18:18
 */
@Component
public class RunnerInfo implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(RunnerInfo.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("这是启动类子项目");
    }
}
