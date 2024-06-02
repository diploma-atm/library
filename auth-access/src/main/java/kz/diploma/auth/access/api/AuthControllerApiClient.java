package kz.diploma.auth.access.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="auth-service")
public interface AuthControllerApiClient extends AuthControllerApi {
}