package com.jeethink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 启动程序
 * 
 * @author jeethink www.jeethink.vip
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class JeeThinkApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        System.out.println("(♥◠‿◠)ﾉﾞ  JeeThink启动成功1   ლ(´ڡ`ლ)ﾞ  \n");
        SpringApplication.run(JeeThinkApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  44JeeThink启动成功   ლ(´ڡ`ლ)ﾞ  \n"+"1111");

    }
}
