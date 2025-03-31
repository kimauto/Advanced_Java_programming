package lamda.ex1;

import lamda.Procedure;

public class M1After {

    public static void greet(String message){
        System.out.println("=== 시작 ===");
        System.out.println(message);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greet("Good Morning");
        greet("Good afternoon");
        greet("Good evening");
    }

}
