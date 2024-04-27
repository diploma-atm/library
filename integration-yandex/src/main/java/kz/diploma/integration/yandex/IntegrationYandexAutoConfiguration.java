package kz.diploma.integration.yandex;

import kz.diploma.integration.yandex.api.YandexControllerApiClient;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan
@EnableFeignClients(clients = YandexControllerApiClient.class)
public class IntegrationYandexAutoConfiguration {

}
