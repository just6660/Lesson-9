
package employeeProject.assignment;


public class FTEmployee extends Employee {
    
    public FTEmployee(){
        super();
    }
    
    
    //complete getPay
    @Override
    public double getPay(){
        
        //update totalPay
        //over 40 hours is oduble the rate
        totalPay+=1; //change this
        return 0;
    }
    
}
