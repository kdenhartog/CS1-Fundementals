public class Zoo {

  private double loan;
  private double interest;
  private Workforce wf;
  private Exhibits ex;
   
    public zoo(double loan,double interest){
      
    this.loan = loan;
    this.interest = interest;
    wf = new Worforce();
    ex = new Exhibits();
      
    public void addExhibit();{
    
    ex.addExhibit();
    wf.addWorkers();
   
    }
    
    public void setWorkerSalary(double salary);{
    
    wf.setWorkerSalary();
    
    }
    public void setAverageExhibitUpkeep (double upkeep); {
        
    ex.upkeep();
    
    }    
  
    public double calculateProfitNeeded();{
    
      Total expenses = (loan)*(interest)+(totalSalary)+(totalUpkeep);
    }
}


    