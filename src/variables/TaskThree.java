package variables;

public class TaskThree {
    int xyz = 123;
    static int zxy = 321;

    public static void main(String[] args) {
        myLuckyNumber();
        TaskThree obj = new TaskThree();

    }




    public static void myLuckyNumber() {
        System.out.println(zxy);
        TaskThree taskThree = new TaskThree();
        System.out.println(taskThree.xyz);
    }

    void myFavouriteNumber() {
        System.out.println(xyz);
        System.out.println(TaskThree.zxy);
    }
}