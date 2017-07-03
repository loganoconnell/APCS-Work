// Lab18av100_OCONNELL.java
// The Student Records Algorithm Program
// This is the student, starting version of the Lab18a lab assignment.

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Lab18av100_OCONNELL {
	public static void main(String[] args) throws IOException {
		List studentArray = new List(100);
		studentArray.getList();
		studentArray.display("UNSORTED LIST OF STUDENTS");
		studentArray.pause();

		studentArray.gpaSort();
		studentArray.display("STUDENTS SORTED IN DESCENDING ORDER BY GPA");
		studentArray.pause();

		studentArray.ageSort();
		studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY AGE");
		studentArray.pause();

		studentArray.idSort();
		studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID#");
		studentArray.pause();

		int studentID = getID();
		int index = studentArray.search(studentID);

		if (index == -1)
		    System.out.println("There is no student with an ID# of "+studentID+".\n");

		else {
			studentArray.displayStudent(index);   // displays the information for the found student
 		   studentArray.delete(index);           // remove the same student from the array
			studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID# WITHOUT STUDENT# "+studentID);
			studentArray.pause();
		}
	}

	public static int getID() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 6-digit ID of the student.  { 100000 - 999999 }  -->  ");
		return input.nextInt();
	}
}


class Person {
	public String name;
	public int id;
	public int age;
	public double gpa;

	Person(String n, int ID, int a,double g) {
		name = n;
		id = ID;
		age = a;
		gpa = g;
	}
}

class List {
	private Person student[];	// stores array elements
	private int capacity;		// actual array capacity
	private int size;			// number of elements in the array

	public List(int c) {
		capacity = c;
		size = 0;
		student = new Person[capacity];
	}

	public void getList() throws IOException {
		FileReader inFile = new FileReader("students.dat");
		BufferedReader inStream = new BufferedReader(inFile);
		String s1,s2,s3,s4;
		int age, id;
		double gpa;
		int index = 0;
      
		while(((s1 = inStream.readLine()) != null) &&
			   ((s2 = inStream.readLine()) != null) &&
			   ((s3 = inStream.readLine()) != null) &&
			   ((s4 = inStream.readLine()) != null)) {
			String name = s1;
			id = Integer.parseInt(s2);
			age = Integer.parseInt(s3);
			gpa = Double.parseDouble(s4);

			student[index] = new Person(name,id,age,gpa);
			index++;
		}
      
		inStream.close();
		size = index;
	}

	private String spaces(String name) {
    	int tab = 24 - name.length();
    	String temp = "";
    	for (int j = 1; j <= tab; j++)
    	    temp += " ";
    	return temp;
   }

	public void display(String listInfo) {
		DecimalFormat output = new DecimalFormat("0.000");
		System.out.println("\nDISPLAYING "+ listInfo);
		System.out.println("\nStudent ID#     Student Name            Age         GPA");
		System.out.println("============================================================");

		for (int k = 0; k < size; k++)
			System.out.println(student[k].id + "          "+student[k].name + spaces(student[k].name) + student[k].age + "          " + output.format(student[k].gpa));
	}

	public void pause() {
		Scanner input = new Scanner(System.in);
		String dummy;
		System.out.println("\nPress <Enter> to continue.");
		dummy = input.nextLine();
	}

	public void displayStudent(int index) {
      Person p = student[index];
      System.out.println("\nName: " + p.name + "\nAge: " + p.age + "\nGPA: " + p.gpa);
	}

	private void swap(int x, int y) {
      Person temp = student[x];
      student[x] = student[y];
      student[y] = temp;
	}

   // Bubble Sort
	public void gpaSort() {
      Person temp;
      
      for (int p = 1; p < size; p++)
         for (int q = 0; q < size - 1; q++)
            if (student[q].gpa < student[q + 1].gpa) {
               temp = student[q];
               student[q] = student[q + 1];
               student[q + 1] = temp;
            }
	}

   // Selection Sort
	public void ageSort() {
      int smallest;
      
      for (int p = 0; p < size - 1; p++) {
         smallest = p;
         
         for (int q = p + 1; q < size; q++)
            if (student[q].age < student[smallest].age)
               smallest = q;
            
         if (student[p] != student[smallest])
            swap(p, smallest);
      }
	}

   // Bubble Sort
	public void idSort() {
      Person temp;
      
      for (int p = 1; p < size; p++)
         for (int q = 0; q < size - 1; q++)
            if (student[q].id > student[q + 1].id) {
               temp = student[q];
               student[q] = student[q + 1];
               student[q + 1] = temp;
            }  
	}
   
   // Binary Search
	public int search(int studentID) {
      idSort();
		
      boolean found = false;
		int lo = 0, hi = size - 1, mid = 0;
      
		while (lo <= hi && !found) {
			mid = (lo + hi) / 2;
			
         if (student[mid].id == studentID)
				found = true;
            
			else {
				if (studentID > student[mid].id)
					lo = mid + 1;
               
				else
					hi = mid - 1;
			}
		}
      
		if (found) {
			idSort();
			
         return mid;
		}
      
		else
			return -1;
	}

	public void delete(int index) {
		for (int st = index; st < size - 1; st++){
    		student[st] = student[st + 1];
    	}
      
      size--;
	}
}