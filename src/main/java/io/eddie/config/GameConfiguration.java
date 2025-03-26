package io.eddie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "io.eddie.app", "io.eddie.repository" })
public class GameConfiguration {
}
