import java.util.Scanner;

class Fibonacci{
    static int fibonacci_rec(int n) {
        if (n <= 1)
            return n;  // Base case: fib(0)=0, fib(1)=1
        else
            return fibonacci_rec(n - 1) + fibonacci_rec(n - 2); // Recursive call
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        int first = 0,second = 1;
        int stepCount = 0;
        for (int i=0;i<no;i++){
            System.out.print(first + " ");
            stepCount++;
            int next = first + second;
            stepCount++;
            first = second;
            second = next;
            stepCount+=2;
        }
        System.out.print("Total Steps: " + stepCount);
        for(int i = 0;i<no;i++){
            System.out.println(fibonacci_rec(i));
        }
    }
}