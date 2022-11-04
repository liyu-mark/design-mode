package chapter01.impl;

import chapter01.Operation;

public class Operation_Add extends Operation {

    @Override
    public double get_result() {
        double result = 0;
        result = num_a + num_b;
        return result;
    }
}
