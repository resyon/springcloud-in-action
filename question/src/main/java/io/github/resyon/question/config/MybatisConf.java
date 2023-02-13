package io.github.resyon.question.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("io.github.resyon.question.dao")
public class MybatisConf {
}
