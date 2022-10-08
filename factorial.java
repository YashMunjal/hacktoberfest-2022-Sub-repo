public class Factorial {

    public static void main(String[] args) {
        //Variable definition and assignment
        int num = 5;

        //Call recursive function
        long factorial = multiplyNumbers(num);

        //Print the output
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
