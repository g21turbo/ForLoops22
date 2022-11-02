public class Main {

    public static void main(String[] args) {

        //for loop - declare your index, condition, increment/decrement
        for (int i = 0; i<10; i++) {
            System.out.println(i * 2);
        }

        System.out.println("\n");

        for (int i = 9; i>-1; i--){
            System.out.println(i * 2);
        }

        System.out.println("\n");

        for (int i = 9; i>=0; i-=2){
            System.out.println(i * 2);
        }
    }
}
