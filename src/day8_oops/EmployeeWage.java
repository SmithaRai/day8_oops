package day8_oops;

public class EmployeeWage {
	 static final int wage = 350;
	    static final int MAX_WORKING_DAYS = 20;
	    static final int MAX_WORKING_HRS =160;
	   static int workingHours;
	    static int totalHours;
	   static  int salary;
	    static int totalDays;
	    EmployeeWage(int workingHours , int totalHours,int salary,int totalDays)
	    {
	    	this.workingHours = workingHours;
	        this.totalHours = totalHours;
	        this.salary = salary;
	        this.totalDays = totalDays;
	    }

	    public static void main(String[] args) {
	        
	       
	        EmployeeWage emp = new EmployeeWage(8,0,0,1);

	        while (totalDays != MAX_WORKING_DAYS && totalHours != MAX_WORKING_HRS) {
	            totalDays++;
	            
	            double empCheck = empChoice();
	            
	            switch ((int) empCheck) {
	                case 1 -> workingHours = 8;
	                case 2 -> workingHours = 4;
	                default -> workingHours = 0;
	            }
	            totalHours += workingHours;
	            salary = wage * totalHours;
	        }
	        System.out.println("Total Working Days are " +totalDays);
	        System.out.println("Total Working Hours are " + totalHours);
	        System.out.println("The total salary is " + salary);
	    }
	    static double empChoice(){
	        return Math.floor((Math.random() * 100) % 3);
}
}
