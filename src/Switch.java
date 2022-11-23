import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe od 1 do 3");
        Scanner scanner=new Scanner(System.in);
        int inputNumber=scanner.nextInt();
        switch (inputNumber){
            case 1:
                System.out.println("Wybrano 1");
                break;
            case 2:
                System.out.println("Wybrano 2");
                break;
            case 3:
                System.out.println("Wybrano 3");
                break;
        }
    }
}
