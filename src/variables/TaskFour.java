package variables;

public class TaskFour {

    int a = 10;
    int b = 20;

    static String name = "Dollor";

    static String currency = "pound";

    public static void main(String[] args) {
        spendMoney();
        TaskFour obj = new TaskFour();
        obj.callMe();

    }


    public void callMe(){
        System.out.println(a);
        System.out.println(b);
        TaskFour taskFour = new TaskFour();
        System.out.println(taskFour.name);
        System.out.println(taskFour.currency);


    }
    public static void spendMoney(){
        System.out.println(name);
        System.out.println(currency);
        TaskFour taskFour = new TaskFour();
        System.out.println(taskFour.a);
        System.out.println(taskFour.b);




    }






}


