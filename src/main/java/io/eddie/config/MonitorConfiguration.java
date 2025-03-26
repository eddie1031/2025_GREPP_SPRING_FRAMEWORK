package io.eddie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "io.eddie.controller")
public class MonitorConfiguration {
}
