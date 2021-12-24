package package1;

public class HourlyWorker extends Employee {

	private double hoursWorked;
	private double hourlyRate;
	
	public static void main(String[] args) {
		HourlyWorker hw = new HourlyWorker(1001, "Bob Jones", 25.50, 35.00);
		System.out.println(hw);
		
	}



	

	public HourlyWorker(int employeeID, String fullName, double hourlyRate, double hoursWorked) {
		super(employeeID, fullName, hourlyRate);
		
	      if (hoursWorked < 0.0 || hoursWorked > 80.0) 
	         throw new IllegalArgumentException(
	            "Hours worked must be >= 0.0 and <= 80.0");

	      this.hoursWorked = hoursWorked;
	      this.hourlyRate = hourlyRate;
	}

	@Override
	public double grossPay() {
		if (getHoursWorked() <= 40)                          
	         return getHoursWorked() * getHourlyRate();                                
	      else                                                             
	         return 40 * getHourlyRate() + (getHoursWorked() - 40) * getHourlyRate() * 1.5;
	}

	public double getHoursWorked() {

		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		
		this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override                                                             
	   public String toString()                                              
	   {                                                                     
	      return String.format("%s%n%s: %,.2f%n%s: $%,.2f",
	         super.toString(), "Hours Worked", getHoursWorked(),                     
	         "Gross Pay", grossPay());                                   
	   }     

}
