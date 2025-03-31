package lamda.ex1;

import lamda.MyFunction;
import lamda.Procedure;

import java.util.Arrays;

public class M5MeasureTime {
    public static void main(String[] args) {

        MyFunction add = getOperation("add");
        int apply = add.apply(1, 2);
        System.out.println(apply);
    }
    public static MyFunction getOperation(String st){
        switch (st) {
            case "add" :
                return ((a, b) -> a+b);
            case "sub" :
                return (a, b) -> a-b;
            default:
                return (a, b) -> 0;
        }
    }

}


