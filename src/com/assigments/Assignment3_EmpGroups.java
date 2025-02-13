package com.assigments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {

		
		Assignment3_Employees emp = new Assignment3_Employees();

//		Method 1
		
		System.out.println("********* Method 1 ***********");
				
//		Creating new string array for employees names
		String [] empNames = new String[3];
		empNames[0] = emp.empName1;
		empNames[1] = emp.empName2;
		empNames[2] = emp.empName3;
		
			
//		creating new int array for employee Ids
		int[] empIds = new int[3];
		empIds[0] = emp.empID1;
		empIds[1] = emp.empID2;
		empIds[2] = emp.empID3;

//	looping through empnames array and empIds array and printing output	
	for (int i=0; i < empNames.length; i++) {
		System.out.println("Employee Name : " + empNames[i] + ", Employee ID : " + empIds[i]);
					}
	
	
//	Method 2
	
	System.out.printf("%n ********* Method 2 *********** %n");
	
	
	String[] empName = {emp.empName1, emp.empName2, emp.empName3};
	int [] empId = {emp.empID1, emp.empID2, emp.empID3};


	for (int i=0; i < empName.length; i++) {
		System.out.println("Employee Name : " + empName[i] + ", Employee ID : " + empId[i]);
	}

//	Method 3
	
	System.out.printf("%n ********* Method 3 *********** %n");
	System.out.println("Employee Name : " + empName[0] + ", Employee ID : " + empId[0]);
	System.out.println("Employee Name : " + empName[1] + ", Employee ID : " + empId[1]);
	System.out.println("Employee Name : " + empName[2] + ", Employee ID : " + empId[2]);
	
	
		}
		

	}

