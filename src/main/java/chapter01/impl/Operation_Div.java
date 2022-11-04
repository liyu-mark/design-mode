package chapter01.impl;

import chapter01.Operation;

public class Operation_Div extends Operation {

    @Override
    public double get_result() throws Exception {
        double result = 0;
        if (num_b == 0){
            throw new Exception("除数不能为0");
        }
        result = num_a / num_b;
        return result;
    }
}
