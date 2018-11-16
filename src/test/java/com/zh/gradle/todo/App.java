package com.zh.gradle.todo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {

    static Logger logger = LoggerFactory.getLogger(App.class);

    @Test
    public void hello() {
        logger.info("Hello World!");
    }
}
