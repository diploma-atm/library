package kz.diploma.shared.library.security.chain.base;

public interface AbstractChainStep<IN, OUT> {
    OUT execute(IN in);
}
