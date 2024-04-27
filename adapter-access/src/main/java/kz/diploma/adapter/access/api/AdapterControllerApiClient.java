package kz.diploma.adapter.access.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="adapter")
public interface AdapterControllerApiClient extends AdapterControllerApi {
}