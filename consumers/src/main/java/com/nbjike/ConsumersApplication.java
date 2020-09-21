package com.nbjike;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-09-20 15:56
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.nbjike")
public class ConsumersApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumersApplication.class, args);
  }

}
