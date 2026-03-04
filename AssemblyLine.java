class AssemblyLine
{
   //Declaring variables and constants
   private String assemblyLineName;
   private int totalManufacturedWidgets;
   private int rejectedWidgets;
   
   //No args constructor
   public AssemblyLine()
   {
      assemblyLineName = "Null Name";
      totalManufacturedWidgets = 0;
      rejectedWidgets = 0;
   }
   
   //All args contructor
   public AssemblyLine(String name, int total, int rejected) 
   {
      assemblyLineName = name;
      totalManufacturedWidgets = total;
      rejectedWidgets = rejected;
   }
   
   //Declaring getters and setters
   //Change the assemblyLineName variable
   //@Param name Is the given assembly line name
   public void setAssemblyLineName(String name) 
   {
      assemblyLineName = name;
   }
   
   /**
   Set the number of manufactured widgets
   @Param total The number of widgets 
   */
   public void setTotalManufacturedWidgets(int total) 
   {
      totalManufacturedWidgets = total;
   }
   /**
   Set the number of rejected widgets
   @Param total The number of rejected widgets 
   */   
   public void setRejectedWidgets(int rejected)
   {
      rejectedWidgets = rejected;
   }
   /**
   This method returns the assembly line name
   @Return The assembly line name 
   */   
   public String getAssemblyLineName()
   {
      return assemblyLineName;
   }
   /**
   This method returns the number of manufactured widgets
   @Return The total number of widgets 
   */   
   public int getTotalManufacturedWidgets()
   {
      return totalManufacturedWidgets;
   }
   /**
   This method returns the number of rejected widgets
   @Return The total number of rejected widgets 
   */   
   public int getRejectedWidgets()
   {
      return rejectedWidgets;
   }
   
   /**
   A method returns the total of acceptable widgets
   @Return The total aproved widgets 
   */
   public int getApprovedWidgets() 
   {
      return this.getTotalManufacturedWidgets() - this.getRejectedWidgets();
   }
   
   /**
   A method that return the overall quality of the assembly line by dividing the quantity of approved
   widgets by the total produced.
   @Return A decimal that represents the overall quality of the assembly line
   */
   public double getOverallQuality()
   {
      return ((double) this.getApprovedWidgets() / (double) this.getTotalManufacturedWidgets()) * 100;
   }

}