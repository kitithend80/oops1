import java.util.Scanner;
class Main{
           public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           System.out.print("Enter the temperature in Celsius : ");
           double tp1=input.nextDouble();
           double fh=(tp1*9/5)+32;
           System.out.println("The temperature in Farenheit is : "+fh);
           System.out.print("Enter the temp in Farenheit : ");
           double tp2=input.nextDouble();
           double cl=(tp2-32)*5/9;
           System.out.println("The temperature in Celsius is : "+cl);
      }
}