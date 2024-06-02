package kz.diploma.auth.access;

import kz.diploma.auth.access.api.AuthControllerApiClient;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@AutoConfiguration
@EnableFeignClients(clients = AuthControllerApiClient.class)
public class AuthAccessAutoConfiguration {
}
