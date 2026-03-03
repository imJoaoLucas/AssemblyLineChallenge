import java.util.Scanner;
import java.util.ArrayList;

class AssemblyLineDemo
{
   
   public static AssemblyLine objectCreator()
   {
      String name;
      int manufacturedWidgets;
      int rejectedWidgets;
      //Declaring the scanner variable;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Write the assembly line's name: ");
      name = input.next();
      
      System.out.print("\nThe number of manufactured widgets: ");
      manufacturedWidgets = input.nextInt();
      
      while(manufacturedWidgets <= 1)
      {
         System.out.print("\nWrite a number gratter than 1: ");
         manufacturedWidgets = input.nextInt();
      }
      
      System.out.print("\nWrite the number of rejected items at this line: ");
      rejectedWidgets = input.nextInt();
      
      while(rejectedWidgets < 0 || rejectedWidgets > manufacturedWidgets)
      {
         System.out.print("\nThe number of rejected parts should not be less then 0 "+
                           "or more than the manufactured amount, enter it again: ");
         rejectedWidgets = input.nextInt();
      }
      
      //Calling the AssemblyLine contructor passing the input information as arguments
      AssemblyLine a1 = new AssemblyLine(name, manufacturedWidgets, rejectedWidgets);
      
      System.out.println(name);
      System.out.println(manufacturedWidgets);
      System.out.println(rejectedWidgets);
      
      return a1;
      
   }
   public static void main(String[] args)
   {  
      Scanner input = new Scanner(System.in);
      String sentinel;
      double sum = 0;
      String factoryEfficiency;
      ArrayList<AssemblyLine> aLineList = new ArrayList<AssemblyLine>();
      
      do
      {
         aLineList.add(objectCreator());     
         System.out.print("Do you wish to enter information for another assembly line (Y/N)?");
         sentinel = input.next();
      }while(sentinel.equalsIgnoreCase("y"));
      
      System.out.println("\nQuality Report:");
      
      for(AssemblyLine a : aLineList)
      {
         System.out.println("\nAssembly Line: " + a.getAssemblyLineName());
         System.out.printf("\nQuality (as a percentage): %.2f ", a.getOverallQuality());
         sum += a.getOverallQuality();
      }
      
      double avarageEfficiency = sum / aLineList.size();
      
      if(avarageEfficiency >= 95) 
      {
         factoryEfficiency = "Excellent";
      } else if (avarageEfficiency < 95 && avarageEfficiency >= 90) {
         factoryEfficiency = "Good";
      } else {
         factoryEfficiency = "Unacceptable";
      }
      
      System.out.println("\nThe efficiency of the factory is: " + factoryEfficiency);
          
   }
}