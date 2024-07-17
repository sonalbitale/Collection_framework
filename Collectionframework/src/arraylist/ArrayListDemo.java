package arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	public static void main(String args[]) 
	{
	ArrayList<String> list = new ArrayList<>();
	
	// Add operations 
	list.add("101");
	list.add("sonal");
	list.add("student");
	System.out.println(list);
	
	// iterate through a list 
	// by using for loop
	for(int i =0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	// iterate by using enhance for loop
	
	System.out.println("traverse by enhanced for loop");
	for(String stu_data:list) {
		System.out.println(stu_data);
	}
	
	// iterate by using iterator 
	System.out.println("traverse by iterate");
	Iterator<String> iterate = list.iterator();
	while(iterate.hasNext()) {
		System.out.println(iterate.next());
	}
	
	
	// remove element by index i
	System.out.println("removing element ");
	 String b  = list.remove(2);
	 System.out.println(" this element been removed from the list" +b);
	
	 System.out.println(" list after removing  the elemnt by using index i "+list);
	
	 
	 // chceck if element is present or not
	 boolean contains = list.contains("sonal");
	 System.out.println(contains);
	
	
	 
	 // adding another class objects 
	 
		ArrayList<Student> list1 = new ArrayList<>();
	 Student stu = new Student("mrunal",101);
	 Student stu1 = new Student("monali",102);
	 
	 list1.add(stu);
	 list1.add(stu1);
	 
	 System.out.println("the person class details is here "+ list1);
	
	}
	
	
	

}
