package variables;

public class TaskFifteen {
    public static void main (String[] args) {
        int x = 12, y = 25;

        System.out.println("Original values of x and y");
        System.out.println("x = " + x);

        System.out.println("y = " + y);

        x = x ^ y ^ (y = x);

        System.out.println("Swapped values of x and y");

        System.out.println("x = " + x);

        System.out.println("y = " + y);

    }

}
