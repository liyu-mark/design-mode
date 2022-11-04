package chapter01;

/**
 * 工厂模式
 */
public class operation_main {

    public static void main(String[] args) throws Exception {

        Operation factory = OperatorFactory.get_factory("*");
        factory.num_a = 2;
        factory.num_b = 3;

        double result = factory.get_result();
        System.out.println("结果: "+result);
    }

}
