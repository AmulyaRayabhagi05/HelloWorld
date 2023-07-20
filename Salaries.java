
//Name:Amulya Prasad Rayabhagi
//Period: 3B

public class Salaries
{
    public static void main(String[] args)
    {
        //1
        String hi="hi"; //Declare and intialize
        String mom="Mom"; // Declare and intialize
        System.out.println(hi + ", " + mom);
        System.out.println();
        //2
        String hi2;//declare
        hi2= "hi";//intialize
        String mom2;//declare
        mom2= "Mom";//intialize
        System.out.println(hi + ", " + mom + "!");
        System.out.println();
        //3
        String someName="Bob";
        System.out.println("Hello, " + someName+ "!");
        System.out.println();
        //4
        String hello= "Hello";
        String world= "World";
        System.out.println(hello+ ", "+ world+"... Goodbye");
        System.out.println();
        //5
        System.out.println("Nothing");
        System.out.println();
        //6 
        int a=14;
        int b=6;
        System.out.println(a+ " % " + b +  " is " + a%b);
        System.out.println();
        //7
        int minutes= 105;
        System.out.println(minutes/60 + ":" + minutes%60);
        System.out.println();
        //Salary Calculation App
        double hourlyRate= 50;
        double hoursWorked= 30;
        double overtimeHours= 15;
        
        double totalSalary= hoursWorked*hourlyRate;
        totalSalary+=overtimeHours * 1.5 * hourlyRate;
        double taxRate= 0.25;
        double netSalary= totalSalary- totalSalary*taxRate;
        
        System.out.println("Hourly rate >>> "+ hourlyRate);
        System.out.println("Regular hours worked >>> "+ hoursWorked);
        System.out.println("Overtime hours worked >>> " + overtimeHours);
        System.out.println();
        System.out.println("Gross salaray(total, before taxes) >>> $"+ totalSalary);
        System.out.println("Net salary (after taxes) >>> $" + netSalary);
       
        
     
    }
}
