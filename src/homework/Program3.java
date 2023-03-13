package homework;

/**
 * Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    int a =5;
    static int b =10;

    public void add() {
        System.out.println(a);
    }

    public static void myMethod() {

        System.out.println(b);
    }

    public static void main(String[] args) {
      Program3 p3 =new Program3();
      p3 .add();
      myMethod();

    }
}
