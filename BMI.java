// Amulya Prasad Rayabhagi 
// 3b
import java.util.*;
public class BMI
{
    public static void main(String[] args )
    {
        Scanner console = new Scanner(System.in);
        // 1
        System.out.print("Enter an integer value >>>");
        int num1= console.nextInt();
        System.out.println(num1 + 10);
        //2
        System.out.print("Enter your first name >>>");
        String name1= console.next();
        System.out.println("Hello, " + name1 + "!");
        //3
        System.out.print("Enter a double value >>>");
        double something= console.nextDouble();
        System.out.println(something*something);
        //4
        System.out.println("The answer to the riddle is Name");
        //5
        System.out.print("Enter a String >>>");
        String name2= console.next();
        System.out.print("Enter an integer >>>");
        int age= console.nextInt();
        System.out.println(name2 + " is " + age + " years old");
        //6
        System.out.print("Enter a double >>>");
        double radius= console.nextDouble();
        double pi= 3.14159;// Saved it as an another variable because it could be used later.
   
        System.out.println(pi*radius*radius);
        //7
        System.out.print("Enter a floating point >>>");
        double time= console.nextDouble();
        
        double  gravity= 32.17405;
        System.out.println("Distance traveled >>> " + (0.5* gravity*(time*time)));
        //8
        System.out.println(name1+name1+name1);
        
       //BIM Calculator
        System.out.print("Enter your height(inches): ");
        double height= console.nextDouble();
        System.out.print("Enter your weight (pounds): ");
        double weight= console.nextDouble();
        
      
        double heightInMeters= height/39.37;
       
        double weightInKg= weight/2.205;
        
      
        System.out.println(weightInKg/(heightInMeters * heightInMeters));
        
        
        
        
        
        
        
        
    }
}
