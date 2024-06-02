package kz.diploma.shared.library.security;

import kz.diploma.shared.library.security.chain.main.AuthStateChain;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
@ComponentScan
public class SecurityInterceptorConfiguration implements WebMvcConfigurer {
    private final AuthStateChain chain;

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        final RequestInterceptor requestInterceptor = new RequestInterceptor(chain);
        registry.addInterceptor(requestInterceptor);
    }

}
