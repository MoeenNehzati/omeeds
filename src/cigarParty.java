public class cigarParty {
    public static void main(String[] args) {
        String[] l = {"palang", "babr", "shir"};
//        System.out.println(l);
        System.out.println(l[0]);
//        System.out.println(l.length);
        String result = "";
        for (String element: l){
            result = result + element + ", ";
        }
        result = result + " az omid zaeeftaran. ";
        System.out.println(result);

        String element;
        for (int index = 0; index < l.length; index = index+1) {
            element = l[index];
            System.out.println(l[index]);

        }

    }
}
