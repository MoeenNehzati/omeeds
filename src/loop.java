public class loop {
    public static void main(String[] args){
        if (add(1,2) == 10){
            System.out.println("congrats the addition results in a round number");
        }
        else{
            System.out.println("boo");
        }
    }
    public static int add(int first, int second){
        System.out.println("entered method add");
        System.out.println("inputs are " + first + " " + second);
        System.out.println("exiting add");
        return first+second;
    }
}
