import java.util.Scanner;
       class factorial{
             public static void main(String[] args){
             //to calculate the factorial of a number 
             Scanner input=new Scanner(System.in);
             System.out.print("Enter the number : " );
             int n=input.nextInt();
             int fact=1;
             for (int i=1; n>=i; --n){
                     fact*=n;
             }
             System.out.println("Factorial:" +fact);
        }
} 