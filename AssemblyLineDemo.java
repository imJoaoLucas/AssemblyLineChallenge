import java.util.Scanner;
import java.util.ArrayList;

class AssemblyLineDemo
{
   /**
   This method prompts the user for informations regarding the assembly line in order to
   use these informations to create the Assembly line object
   @Return The AssemblyLine object created using the information provided by the user.
   */
   public static AssemblyLine objectCreator()
   {
      //Declaring variables and constants
      String name;
      int manufacturedWidgets;
      int rejectedWidgets;
      //Declaring the scanner variable;
      Scanner input = new Scanner(System.in);
      
      //User input prompts
      
      System.out.print("Write the assembly line's name: ");
      name = input.next();
      
      System.out.print("\nThe number of manufactured widgets: ");
      manufacturedWidgets = input.nextInt();
      
      //Input validation to not accept less than 1 widget
      while(manufacturedWidgets <= 1)
      {
         System.out.print("\nWrite a number gratter than 1: ");
         manufacturedWidgets = input.nextInt();
      }
      
      System.out.print("\nWrite the number of rejected items at this line: ");
      rejectedWidgets = input.nextInt();
      
      //Input validation to not accept less than 0 or more than the amount manufatured
      while(rejectedWidgets < 0 || rejectedWidgets > manufacturedWidgets)
      {
         System.out.print("\nThe number of rejected parts should not be less then 0 "+
                           "or more than the manufactured amount, enter it again: ");
         rejectedWidgets = input.nextInt();
      }
      
      //Calling the AssemblyLine contructor passing the input information as arguments
      AssemblyLine a1 = new AssemblyLine(name, manufacturedWidgets, rejectedWidgets);
   
      return a1;
      
   }
   public static void main(String[] args)
   {  
      //Declaring variables and constants
      Scanner input = new Scanner(System.in);
      String sentinel;
      String factoryEfficiency;
      
      double sum = 0;
      
      ArrayList<AssemblyLine> aLineList = new ArrayList<AssemblyLine>();
      
      int EXCELLENT_RATING = 95;
      int GOOD_RATING = 90;
      
      //User input the assembly line information until told to stop.
      do
      {
         aLineList.add(objectCreator());     
         System.out.print("Do you wish to enter information for another assembly line (Y/N)?");
         sentinel = input.next();
      }while(sentinel.equalsIgnoreCase("y"));
      
      System.out.println("\nQuality Report:");
      
      //For each loop to display all assembly lines informations 
      for(AssemblyLine a : aLineList)
      {
         System.out.println("\nAssembly Line: " + a.getAssemblyLineName());
         System.out.printf("\nQuality (as a percentage): %.2f ", a.getOverallQuality());
         //Accumulator to calculate the efficiency
         sum += a.getOverallQuality();
      }
      
      double avarageEfficiency = sum / aLineList.size();
      
      
      if(avarageEfficiency >= EXCELLENT_RATING) 
      {
         factoryEfficiency = "Excellent";
      } else if (avarageEfficiency < EXCELLENT_RATING && avarageEfficiency >= GOOD_RATING) {
         factoryEfficiency = "Good";
      } else {
         factoryEfficiency = "Unacceptable";
      }
      
      System.out.println("\nThe efficiency of the factory is: " + factoryEfficiency);
          
   }
}