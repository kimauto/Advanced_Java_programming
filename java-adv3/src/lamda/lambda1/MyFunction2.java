package lamda.lambda1;

import lamda.MyFunction;

public class MyFunction2 {

    public static void main(String[] args) {
        MyFunction myFunction2 = (int a, int b) -> {
            return a + b;

        };

        int apply = myFunction2.apply(1, 2);
        System.out.println(apply);
    }
}
