package variables;

public class TaskFourteen {


    public static void main(String[] strings) {

        final double width = 5.5;
        final double height = 8.5;

        double area = width * height ;
        double perimeter = 2*(height + width);



        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }

}
