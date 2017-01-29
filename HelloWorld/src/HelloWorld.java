import java.util.Scanner;

/**
 * Created by Colin on 2017-01-23.
 */
public class HelloWorld {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your date of birth: ");
        int dob = scanner.nextInt();

        int year = (2017 - dob);

        System.out.println("Your name is " + name + " and you are " + year + " years old!!");

    }

}
