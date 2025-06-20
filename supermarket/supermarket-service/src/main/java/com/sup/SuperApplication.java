package com.sup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Slf4j
public class SuperApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SuperApplication.class,args);
        log.info("项目启动成功");
    }
}
