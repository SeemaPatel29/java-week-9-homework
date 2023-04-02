package calculate;

import java.util.Scanner;

public class Main extends Calculator{
    // declaring variable
    int x;
    int y;
    char z;
// main method for Main class
    public static void main(String[] args) {
        Main main = new Main();
        Calculator calculator = new Calculator();
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean yn;

        System.out.println("Please enter first number      :");
        main.x = scanner.nextInt();
        System.out.println("Please enter second number      :");
        main.y = scanner.nextInt();
        System.out.println("Please enter one of symbol =,- ,/,*       :");
        main.z = scanner.next().charAt(0);
        calculator.calculateResult(main.x, main.y, main.z);
        System.out.println("Do you want to continue (y/n)     :");

        while (true){
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("n")){
                yn = true;
                break;
            } else if (answer.equals("y")) {
                //yn false;
                System.out.println("Please enter first number       :");
                main.x = scanner.nextInt();
                System.out.println("Please enter second number       :");
                main.y = scanner.nextInt();
                System.out.println("Please enter one of symbol =,- ,/,*       :");
                main.z = scanner.next().charAt(0);
                calculator.calculateResult(main.x, main.y, main.z);
                System.out.println("Do you want to continue (y/n)     :");
            }
        }
        scanner.close();













    }

}
