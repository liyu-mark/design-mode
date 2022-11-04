package chapter01;

import chapter01.impl.Operation_Add;
import chapter01.impl.Operation_Div;
import chapter01.impl.Operation_Mul;
import chapter01.impl.Operation_Sub;

public class OperatorFactory {

    public static Operation get_factory(String operator){

        Operation oper = null;
        switch (operator){
            case "+":
                oper = new Operation_Add();
                break;
            case "-":
                oper = new Operation_Sub();
                break;
            case "*":
                oper = new Operation_Mul();
                break;
            case "/":
                oper = new Operation_Div();
                break;
        }

        return oper;
    }
}
