package lamda.ex3;

import lamda.ex2.StringFunction;

public class BuildGreeterExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성

        return new StringFunction() {
            @Override
            public String apply(String name) {
                return greeting + ", " + name;
            }
        }; // 적절한 람다 반환
    }
    public static void main(String[] args) {
        // 코드 작성
        StringFunction hello = buildGreeter("Hello");
        StringFunction hi = buildGreeter("Hi");
        System.out.println( hello.apply("java"));
        hi.apply("java");
    }
}
