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
   public void setAssemblyLineName(String name) 
   {
      assemblyLineName = name;
   }
   
   public void setTotalManufacturedWidgets(int total) 
   {
      totalManufacturedWidgets = total;
   }
   
   public void setRejectedWidgets(int rejected)
   {
      rejectedWidgets = rejected;
   }
   
   public String getAssemblyLineName()
   {
      return assemblyLineName;
   }
   
   public int getTotalManufacturedWidgets()
   {
      return totalManufacturedWidgets;
   }
   
   public int getRejectedWidgets()
   {
      return rejectedWidgets;
   }
   
   //A method returns the total of acceptable widgets
   public int getApprovedWidgets() 
   {
      return this.getTotalManufacturedWidgets() - this.getRejectedWidgets();
   }
   
   //A method that return the overall quality of the assembly line
   public double getOverallQuality()
   {
      return ((double) this.getApprovedWidgets() / (double) this.getTotalManufacturedWidgets()) * 100;
   }

}