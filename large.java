import java.util.Scanner;
class ternary{
           public static void main(String[] args){
           //use ternary operator
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the first number : " );
           int a=input.nextInt();
           System.out.print("Enter the second number : ");
           int b=input.nextInt();
           System.out.print("Enter the third number : ");
           int c=input.nextInt();
           int result=(a>b)? ((a>c)? a:c) : ((b>c)? b:c);
           System.out.println("The Largest Number is: "+result);
      }
} 