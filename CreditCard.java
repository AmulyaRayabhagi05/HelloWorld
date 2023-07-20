//Name:Amulya Prasad Rayabhagi
//Period: 3B
import java.lang.Math;
public class CreditCard
{
    public static void main(String[] args)
    {
       //2 
       double tuna=2.99;
       System.out.println(tuna + 3);
       //3
       tuna++;
       System.out.println(tuna);
       //4
       tuna+=5;
       System.out.println(tuna);
       //5
       tuna/=10;
       System.out.println(tuna);
       //6
       int a=4;
       int b=6;
       // I think the expression will be 98
       int solve= 2*a+3*b*(a+b)/2;
       System.out.println(solve);
       //7
       int c=5;
       int d=9;
       //I think the expression will be -49
       int solving= -1 * (c+d) * (c+d) / 4;
       System.out.println(solving);
       //8 riddle
       System.out.println("She is too short hence on rainy days she uses her umbrella to reach the button but on sundays she can't reach the number that is why she goes to 20th floor.");
       //9
       double pi=3.14159;
       double radius=6.5;
       radius*=radius;
       System.out.println(pi*radius);
       //10
       double something= 4.5;
       something*=something;
       System.out.println(something);
       //11
       int sideA=4;
       int sideB=9;
       System.out.println(sideA*sideA+sideB*sideB);
       //12
       System.out.println(sideA%sideB);
       //Credit Card Payment
       double totalDebt;
       double minMonthlyPayment;
       totalDebt=500000;
       minMonthlyPayment=0.05*totalDebt;
       System.out.println("Total debt >>> "+totalDebt);
       System.out.println("Minimum monthly payment(5%) >>> "+ minMonthlyPayment);
       double numMonths=5;
       System.out.println("Total debt>>> "+numMonths);
       System.out.println("Desired months to pay off debt >>> "+numMonths);
       System.out.println("Monthly payment required >>> "+ totalDebt/numMonths);
       
       
    }
}
