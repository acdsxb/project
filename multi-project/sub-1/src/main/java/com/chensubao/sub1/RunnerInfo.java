package com.chensubao.sub1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @author chensubao
 * @date 2019/4/7 17:57
 */
@Component
public class RunnerInfo implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(RunnerInfo.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("这是子项目sub-1，在启动时就会输出");
    }
}
