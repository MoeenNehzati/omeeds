import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
//        Declaring a variable of type Scanner
        Scanner sc;
//        defines the value assigned to sc
        sc = new Scanner(System.in);
//       prompt the user for information
        System.out.println("say something");
//        Waits for when the user enters a line by pressing enter
        String input = sc.nextLine();
        System.out.println("you said: "+ input);
        System.out.println("give me an integer so I can multiply it by two");
//        Can't say this
//        int num = sc.nextLine();
//        You can:
        int num = sc.nextInt();
        System.out.println("result is "+ num*2);
    }
}


//
//For next week:
//Ask for name and age, print their year of birth