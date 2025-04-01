import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
//        two equalities == checks equality
        System.out.println("System.out.println(22 == 22)");
        System.out.println(22 == 22);
//        <= means < or ==
        System.out.println("System.out.println(22 <= 22)");
        System.out.println(22 <= 22);
        System.out.println("System.out.println(12 <= 22)");
        System.out.println(21 <= 22);
        System.out.println("System.out.println(22 < 22)");
        System.out.println(22 < 22);
        System.out.println("System.out.println(20 < 30 && 30 <40)");
        System.out.println(20 < 30 && 30 <40);
        System.out.println("What's you school level? elementary, middle, high");
        Scanner sc = new Scanner(System.in);
        String level = sc.nextLine();
        level = level.toLowerCase();
        boolean is_elementary = level.equals("elementary");
        boolean is_middle = level.equals("middle");
//        You can OR two booleans with || and AND them with &&
        if  (is_elementary || is_middle){
            System.out.println("not in high school");
        }
//        .equals checks whether the value is equal to what comes next
        else if (is_elementary) {
            System.out.println("you're a baby");
        }
        else if (level.equals("middle")) {
            System.out.println("you're not a baby");
        }
        else if (level.equals("high")) {
            System.out.println("you're old");
        }
        else {
            System.out.println("I don't know what to say");
        }
//
    }

}
