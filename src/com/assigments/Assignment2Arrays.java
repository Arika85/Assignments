package com.assigments;

public class Assignment2Arrays {

	public static void main(String[] args) {
		String [][][] data = {
//				Semester 1
				{
					{"Mathematics I", "Physics", "Chemistry", "Computer Prograaming", "Engineering Drawing", "Basic Electrical Eng"},
					{"78", "85", "91", "74", "88", "79"},
				},
				
//				Semester 2
				{
					{"Mathematics II", "Mechanics", "Environmental Sci", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
					{"82", "77", "93", "69", "84", "90"},
				},
//				Semester 3
				{
					{"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-oriented Prog"},
					{"88", "81", "76", "92", "85", "78"},
				},
//				Semester 4
				{
					{"Algorithims", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng", "Software Engineering"},
					{"91", "73", "89", "80", "76", "87"},
				},
//				Semester 5
				{
					{"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
					{"86", "88", "84", "95", "73", "90"}
				},
				
		};
		
//		Printing semester 3 - subject 4 and 5 names
		System.out.println("Semester 3 - Subject 4 and 5 Names : " + data[2][0][3] + " & " + data[2][0][4]);
//		Printing semester 5 - subject 3 and subject 6 marks
		System.out.println("Semester 5 - Subject 3 and 6 Marks : " + data[4][1][2] + " and " + data[4][1][5]);
		

	}

}
