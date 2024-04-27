package kz.diploma.adapter.access;

import kz.diploma.adapter.access.api.AdapterControllerApiClient;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan
@EnableFeignClients(clients = AdapterControllerApiClient.class)
public class AdapterFeignAutoConfiguration {
}
