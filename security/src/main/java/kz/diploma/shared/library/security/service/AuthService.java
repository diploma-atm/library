package kz.diploma.shared.library.security.service;

import kz.diploma.shared.library.security.model.Roles;

public interface AuthService {
    Roles checkSession(String token);
}
