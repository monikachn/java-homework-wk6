package homework;

/**
 * Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    int a = 5;
    int b = 10;
    static int c = 15;
    static int d = 20;

    public void add() {
        System.out.println(a+"  "   + b);

    }

    public static void myMethod(){
        System.out.println(c+" " +d );

    }

    public static void main(String[] args) {
        Program4 p4 =new Program4();
        p4.add();
        myMethod();
    }
}

