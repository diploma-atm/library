package kz.diploma.shared.library.security.chain.auth.impl;

import kz.diploma.shared.library.security.chain.base.AbstractChainStep;
import kz.diploma.shared.library.security.chain.base.ConditionalChainStep;
import kz.diploma.shared.library.security.chain.auth.params.InputAuthParams;
import kz.diploma.shared.library.security.chain.auth.params.OutputAuthParams;

public abstract class AuthConditionalChainStep extends ConditionalChainStep<InputAuthParams, OutputAuthParams> {
    protected AuthConditionalChainStep(AbstractChainStep<InputAuthParams, OutputAuthParams> chainA, AbstractChainStep<InputAuthParams, OutputAuthParams> chainB) {
        super(chainA, chainB);
    }
}
