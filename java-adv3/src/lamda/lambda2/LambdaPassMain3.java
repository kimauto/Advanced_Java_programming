package lamda.lambda2;

import lamda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {

        MyFunction add = getOperation("add");
        int apply = add.apply(1, 2);
        System.out.println(apply);

    }

    // 람다를 반환하는 메서드
    static  MyFunction getOperation(String operator){
        switch (operator){
            case "add" :
                return (a, b) -> a + b;
            case "sub" :
                return ((a, b) -> a-b);
            default:
                return (a, b) -> 0;
        }
    }
}
