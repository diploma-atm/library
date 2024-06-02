package kz.diploma.shared.library.security.chain.def;

import kz.diploma.shared.library.security.annotation.RolesAllowed;
import kz.diploma.shared.library.security.chain.auth.impl.AuthBaseChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.check.CheckRoleStep;
import kz.diploma.shared.library.security.model.Roles;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;

import java.util.List;

@Slf4j
@Component
public class RolesDefinitionStep extends AuthBaseChainStep {
    protected RolesDefinitionStep(CheckRoleStep next) {
        super(next);
    }

    @Override
    public OutputAuthParams execute(InputAuthParams inputAuthParams) {
        boolean hasAccess = checkRolesAllowed(inputAuthParams.getMethod(), inputAuthParams.getRole());
        inputAuthParams.setHasAccess(hasAccess);
        return super.execute(inputAuthParams);
    }

    private boolean checkRolesAllowed(HandlerMethod method, Roles role) {
        RolesAllowed annotation = getRolesAllowed(method);
        if (annotation == null)
            return true;

        List<Roles> allowed = List.of(annotation.value());
        if (allowed.isEmpty())
            return true;

        return allowed.contains(role);
    }

    private static RolesAllowed getRolesAllowed(HandlerMethod method) {
        var annotation = method.getMethod().getAnnotation(RolesAllowed.class);
        if (annotation == null) {
            return method.getMethod().getDeclaringClass().getAnnotation(RolesAllowed.class);
        }
        return null;
    }

}
