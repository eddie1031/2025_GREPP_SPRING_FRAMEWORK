package io.eddie.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Deprecated
//@Configuration
//@EnableWebMvc
//@ComponentScan( basePackages = "io.eddie.controller")
public class MonitorConfiguration {

    // Thymeleaf 템플릿 엔진 설정
//    @Bean
//    public SpringTemplateEngine templateEngine(ApplicationContext applicationContext) {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver(applicationContext));
//        return engine;
//    }
//
//    // Template Resolver 설정
//    @Bean
//    public ITemplateResolver templateResolver(ApplicationContext applicationContext) {
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//
//        resolver.setApplicationContext(applicationContext);
//        resolver.setPrefix("/WEB-INF/");
//        resolver.setSuffix(".text");
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setTemplateMode(TemplateMode.HTML);
//
//        return resolver;
//    }
//
//    // Thymeleaf를 이용하기 위한 View Resolver 등록
//    @Bean
//    public ThymeleafViewResolver viewResolver(SpringTemplateEngine templateEngine) {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//
//        resolver.setTemplateEngine(templateEngine);
//        resolver.setCharacterEncoding("UTF-8");
//
//        return resolver;
//    }

}
