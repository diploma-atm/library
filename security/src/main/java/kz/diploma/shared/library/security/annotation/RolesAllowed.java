package kz.diploma.shared.library.security.annotation;

import kz.diploma.shared.library.security.model.Roles;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD})
public @interface RolesAllowed {
    Roles[] value();
}
