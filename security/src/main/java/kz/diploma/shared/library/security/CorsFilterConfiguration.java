package kz.diploma.shared.library.security;

import jakarta.servlet.http.HttpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CorsFilterConfiguration {
    @Bean
    public HttpFilter httpFilter(){
        return new SimpleCorsFilter();
    }
}
