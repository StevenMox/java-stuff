package ca.comp2080.labtestb.driver;

import ca.comp2080.labtestb.list.MyList;

public class TestProblem1 {

	public static void main(String[] args) {
		
		/*************************************
		 * LAB TEST 1 B - PROBLEM 1
		 ************************************/
		
		//Create MyList L - 2, 3, 5
		MyList<String> L = new MyList<String>();
		L.addLast("2");
		L.addLast("3");
		L.addLast("5");
		System.out.println("Original List L: " + L.toString());
				
		//should swap okay
		L.swap(0);
		System.out.println("Swap starting element:" + L.toString() +"\n");
		
		//should swap okay
		L.swap(1);
		System.out.println("Swap middle element:" + L.toString() +"\n");
		
		//nth element should not swap
		L.swap(2);		
		System.out.println("Swap nth element:" + L.toString() +"\n");
			
		
	} 

}
