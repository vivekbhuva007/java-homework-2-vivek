package variables;

import java.util.Scanner;

public class TaskTharteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number:  ");
        int num1 = in.nextInt();

        System.out.println("Input Second number:");
        int num2 = in.nextInt();

        System.out.println("Input Third number:");
        int num3 = in.nextInt();

        System.out.println("Input Fourth number:");
        int num4 = in.nextInt();

        System.out.println("Input Fifth number:  ");
        int num5 = in.nextInt();

        System.out.println("Average of five numbers is:"+
                (num1 + num2 + num3 + num4 + num5) / 5);




    }

}
