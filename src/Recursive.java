import java.io.*;
public class Recursive {
    public static void main(String[] args) {
        int num = 0;
        int result = num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a number:");
            num = Integer.parseInt(br.readLine());
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static int factorial (int num){
        if(num <= 1) return num;
        else return num*factorial(num-1);
    }
}
