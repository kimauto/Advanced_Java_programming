package lamda.lambda1;

import lamda.Procedure;

public class ProcedureMain1 {

    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        procedure.run();
    }
}
