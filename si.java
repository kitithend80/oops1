import java.util.Scanner;
       class SI{
              public static void main(String[] args){
              Scanner input=new Scanner(System.in);
              System.out.print("Enter the principal amount : " );
              double p=input.nextDouble();
              System.out.print("Enter the rate of interest : " );
              double r=input.nextDouble();
              System.out.print("Enter the time period: ");
              double t=input.nextDouble();
              double intr=(p*t*r)/100;
              System.out.println("Simple Interest:"+intr);
        }
}