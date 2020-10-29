
package employeeProject.assignment;

public class PTEmployee extends Employee {
    public PTEmployee(){
        super();
    }
    //complete getPay
    @Override
    public double getPay(){
        double pay;
        pay = hours * rate;
     
        totalPay+=pay; 
        return pay;
    }
    
}
