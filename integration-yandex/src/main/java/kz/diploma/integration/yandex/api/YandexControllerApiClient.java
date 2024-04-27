package kz.diploma.integration.yandex.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "integration-yandex")
public interface YandexControllerApiClient extends YandexControllerApi {
}