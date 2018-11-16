package com.zh.gradle.subModel;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelTest {
    Logger log = LoggerFactory.getLogger(ModelTest.class);

    @Test
    public void hello() {
        String mes = "*********************This is message. ******---*******************";

        for (int i = 0; i < 5; i++) {
            System.out.println("dddddddddddddderrordERRORdddddddddddddddddddddd");

        }
        
        cyclePrint(mes);
    }

    public void cyclePrint(String mes) {
        for (int i = 0; i < 5; i++) {
            log.info(mes);
        }

        for (int i = 0; i < 5; i++) {
            log.debug(mes);
        }

        for (int i = 0; i < 5; i++) {
            log.error(mes);
        }

        for (int i = 0; i < 5; i++) {
            log.warn(mes);
        }
    }
}
