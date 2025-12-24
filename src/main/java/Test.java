import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Context context=new Context();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Qelle stratégie?");
            String strateyName=scanner.nextLine();
            Class strateyClass= Class.forName(strateyName);
            Strategy strategy=(Strategy)strateyClass.newInstance();
            context.setStrategy(strategy);
            context.applyStrategy();
        }

    }
}
