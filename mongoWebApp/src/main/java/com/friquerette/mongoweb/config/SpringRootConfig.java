package com.friquerette.mongoweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.friquerette.mongoweb.service" })
public class SpringRootConfig {
}