package kz.diploma.shared.library.security.chain.base;

public abstract class ConditionalChainStep<IN, OUT> implements AbstractChainStep<IN, OUT> {
    private final AbstractChainStep<IN, OUT> chainA;
    private final AbstractChainStep<IN, OUT> chainB;

    protected ConditionalChainStep(AbstractChainStep<IN, OUT> chainA, AbstractChainStep<IN, OUT> chainB){
        this.chainA = chainA;
        this.chainB = chainB;
    }

    @Override
    public OUT execute(IN in) {
        return branch(in) ? chainA.execute(in) : chainB.execute(in);
    }

    protected abstract boolean branch(IN in);
}
