public class BigMacWalk
{
    public static void maid(String args[])
    {
     //1.
     int apples;
     //2
     apples= 12;
     //3
     int oranges= 24;
     //4
     System.out.println("You have this many apples:"+ apples);
     System.out.println("You have this many oranges:"+ oranges);
     //5
     double pi;
     pi= 3.14519;
     System.out.println("Pi is equal to: "+ pi);
     //6
     String S= "sides",T= "triangle";
     System.out.println("3 "+S+" on a "+ T);
     //7
     String day= "Tuesday";
     //8
     System.out.println("Hello!Today is: "+ day);
     //9
     int a=10,b=20;
     //10
     int c= b-a;
     System.out.println("b minus a equals:"+ c);
     //11
     int miles=192,gallons=16,mpg=0;
     //12
     mpg= miles/gallons;
     //13
     double length=12.75,width=8.65,areaR=length*width;
     System.out.println("the area of a rectangle is "+ areaR);
     //14
     String P="pockets",PT="pool table";
     System.out.println("6 "+ P+" on a "+ PT);
     //15
     double base=11.89, height=22.4, areaT=.5*base*height;
     System.out.println(areaT);
     //Big Mac Walk app
     double numBigMacs= 3,BigMac_Calories= 590,Burnt_Calories=94;
     double total= numBigMacs*BigMac_Calories,miles_burnt= total/Burnt_Calories;
     System.out.println("Big Macs eaten= "+numBigMacs+"\nTotal calories consumed= "+total+"\nMiles to walk to burn off all those Big Macs= "+miles_burnt);
     //3
     int fries=2,drinks=4,FriCalories= 200,DrinkCalories= 100,totalcal= FriCalories*fries + DrinkCalories*drinks;
     double toburn=totalcal/Burnt_Calories;
     System.out.println("Total calories consumed= "+totalcal+"\nMiles to walk to burn off all that chow= "+toburn);
    }
}
