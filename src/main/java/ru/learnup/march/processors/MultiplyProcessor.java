package ru.learnup.march.processors;

public class MultiplyProcessor implements Processor {

    @Override
    public Long process(Long arg1, Long arg2) {
        return arg1 * arg2;
    }
}
