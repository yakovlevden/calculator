package ru.learnup.march;

import ru.learnup.march.processors.DivideProcessor;
import ru.learnup.march.processors.MultiplyProcessor;
import ru.learnup.march.processors.SubstractProcessor;
import ru.learnup.march.processors.SumProcessor;

public class Calculator {

    private SumProcessor sumProcessor;
    private SubstractProcessor substractProcessor;
    private DivideProcessor divideProcessor;
    private MultiplyProcessor multiplyProcessor;

    public Calculator(SumProcessor sumProcessor, SubstractProcessor substractProcessor, DivideProcessor divideProcessor, MultiplyProcessor multiplyProcessor) {
        this.sumProcessor = sumProcessor;
        this.substractProcessor = substractProcessor;
        this.divideProcessor = divideProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }

    public Long sum(Long arg1, Long arg2) {
        return sumProcessor.process(arg1, arg2);
    }

    public Long substract(Long arg1, Long arg2) {
        return substractProcessor.process(arg1, arg2);
    }

    public Long divide(Long arg1, Long arg2) {
        return divideProcessor.process(arg1, arg2);
    }

    public Long multiply(Long arg1, Long arg2) {
        return multiplyProcessor.process(arg1, arg2);
    }
}
