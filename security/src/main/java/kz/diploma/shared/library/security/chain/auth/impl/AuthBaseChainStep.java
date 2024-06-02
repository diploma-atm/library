package kz.diploma.shared.library.security.chain.auth.impl;

import kz.diploma.shared.library.security.chain.base.AbstractChainStep;
import kz.diploma.shared.library.security.chain.base.BaseChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;

public class AuthBaseChainStep extends BaseChainStep<InputAuthParams, OutputAuthParams> {
    protected AuthBaseChainStep(AbstractChainStep<InputAuthParams, OutputAuthParams> next) {
        super(next);
    }
}
