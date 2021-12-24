package program4;

public class Pay1 {
		
	private int idNumber;
	private double payRate;
	private double totalHours;
	double regHours;
	double overTime;
	double grossPay;
	double deductions;
	double netPay;
	
	
	public int getIdNumber() 
	{
		return idNumber;
	}
	
	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}
	
	public double getPayRate() 
	{
		return payRate;
	}
		
	public void setRegHours(double regHours) 
	{
		this.regHours = regHours;
	}
	
	public double getTotalHours() 
	{
		return totalHours;
	}
	
	public void setTotalHours(double totalHours) 
	{
		this.totalHours = totalHours;
	}
}
