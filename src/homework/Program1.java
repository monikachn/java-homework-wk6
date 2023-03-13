package homework;

/**
 * 1.1 Declare two instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
 1.4 Declare the Main method.
 1.5 Call the above instance method into the Main method and Run the programme.
 *
 */
public class Program1 {

    //instance variable 1
    int a = 20;
    //instance variable 2
    int b = 30;

    //instance method
    public  void add() {
        System.out.println("addition=" + (a + b));
    }
    public static void main(String[] args) {
        Program1 p1 = new Program1();
        p1.add();
    }
}