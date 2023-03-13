package homework;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class CalculatorPr5 {
    int x = 5;
    int y = 10;
    static int c = 15;
    static int d = 20;

    public void addition(int a ,int b){
        int ans = (a+b);
        System.out.println(a + "+" + b + "=" + ans);

    }
    public void subtraction(int a,int b){
        int ans = (a-b);
        System.out.println(a + "-" + b + "=" + ans);
    }
    public static void multiplication(int a,int b){
        int ans =(a*b);
        System.out.println(a + "*" + b + "=" + ans);
    }
    public static void division(int a, int b){
        int ans =(a/b);
        System.out.println(a + "/" +b + "=" + ans);

    }

    public  static void main(String[] args) {
        CalculatorPr5 p5 =new CalculatorPr5();
       p5. addition (5,10);
       p5.subtraction(20,30);
       multiplication(20,30);
       division(30,20);
    }
}
