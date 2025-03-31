package lamda.ex3;

import java.util.List;

public class ReduceExample {
    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, MyReducer
            reducer) {
        int sum = initial;
        for (Integer i : list) {

            sum = reducer.reduce(sum , i);
        }

        return sum; // 적절한 값으로 변경
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);
        // 1. 합 구하기 (초기값 0, 덧셈 로직)
        int reduce = reduce(numbers, 0, new MyReducer() {
            @Override
            public int reduce(int a, int b) {
                return a + b;
            }
        });
        System.out.println(reduce);
        // 2. 곱 구하기 (초기값 1, 곱셈 로직)

        reduce(numbers, 1, new MyReducer() {
            @Override
            public int reduce(int a, int b) {
                return a * b;
            }
        });
        // 코드 작성
    }
}
