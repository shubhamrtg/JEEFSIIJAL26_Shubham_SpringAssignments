package com.cg.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com")
@PropertySource("classpath:cg.properties")
public class MyConfig {

}
