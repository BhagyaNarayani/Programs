import java.util.*;

public class Employees {
	public static void main(String args[]) {
		//ArrayList
		ArrayList<Emp> List = new ArrayList<Emp>();
		List.add( new Emp("Adita", 26, 60000));
		List.add( new Emp("Bhavya", 24, 50000));
		List.add( new Emp("Charmi", 28, 85000));
		List.add( new Emp("Sumaya", 29, 100000));
		List.add( new Emp("Sunitha", 26, 50000));
		List.add( new Emp("Ananya", 32, 120000));
		List.add( new Emp("Akshitha", 21, 20000));
		List.add( new Emp("Amish", 25, 60000));
		List.add( new Emp("Arya", 29, 90000));
		List.add( new Emp("John", 26, 75000));
		
		 int value = 70000;
		 System.out.println("Using for loop");
		 for( int i=0; i<List.size(); i++)
		 {
			 if(List.get(i).getSalary()>value)
			 {
				 System.out.println(List.get(i).getSalary());
			 }
		 }
		 System.out.println("Using while loop");
		 int i=0;
		 while( i<List.size())
		 {
			 
			 if(List.get(i).getSalary()>value)
			 {
				 System.out.println(List.get(i).getSalary());
			 }
			 i++;
			 
		 }
		 System.out.println("Using for each loop");
		 for(Emp e: List)
		 {
			 if(e.getSalary()>value)
				 System.out.println(e.getSalary());
		 }
		 
		
	}

}
