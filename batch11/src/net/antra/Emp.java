package net.antra;

public final class Emp {
	
	/*static {
		System.out.println("in static block");
	}*/
	
	private final int empId;
	
	
	public Emp(int empId) {
		this.empId=empId;
		System.out.println("in parametarized constructor");
	}
	/*{
		
		System.out.println("in instance block");
	}
	public Emp() {
		System.out.println("in default constructor");
	}
	public Emp(int empId) {
		this.empId=empId;
		System.out.println("in parametarized constructor");
	}
*/
	

	public int getEmpId() {
		return empId;
	}

	/*public void setEmpId(int empId) {
		this.empId = empId;
	}*/
	
	public boolean equals(Object o) {
		
		Emp emp1=(Emp)o;
		int empId1=emp1.empId;
		
		int empId2=this.empId;
		
		
		if(empId1==empId2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	/*@Override
	public String toString() {
		
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	
	/*public int hashCode() {
		
		return 123;
	}*/
	
}
