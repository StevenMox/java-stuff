/*
 * COMP2080 Lab Test 1

 * Steven Moxley - 101047922
 */
package driver;

import llclass.LinkedList;
import llclass.LinkedList2;

public class LabTestProblem1A {
public static void main(String[] args) {
		
		//Code to list 2,3,5
		System.out.println("Generating Linked Lists");
		LinkedList<Integer> l = new LinkedList<Integer>(2);
		l.setNext(new LinkedList<Integer>(3));
		l.getNext().setNext(new LinkedList<Integer>(5));
		

		System.out.println("Displaying contents of linked list 1");
		LinkedList<Integer> currNode = l;
		while(currNode.getNext() != null)
		{
			System.out.println(currNode.getInfo());
			currNode = currNode.getNext();
		}
		System.out.println(currNode.getInfo());
		
		//to set list 6,1,8,9 but doesn't work as hoped
		LinkedList2<Integer> m = new LinkedList2<Integer>(6);
		m.setNext(new LinkedList2<Integer>(1));
		m.getNext().setNext(new LinkedList2<Integer>(8)); //can't figure out why it's skipping over the 8....
		m.getNext().setNext(new LinkedList2<Integer>(9));
		

		System.out.println("Displaying contents of linked list 2");
		LinkedList2<Integer> currNode1 = m;
		while(currNode1.getNext() != null)
		{
			System.out.println(currNode1.getInfo());
			currNode1 = currNode1.getNext();
		}
		System.out.println(currNode1.getInfo());
		
		System.out.println("displaying contents of both lists" );
		
		LinkedList<Integer> l1 = new LinkedList<Integer>(2);
		l1.setNext(new LinkedList<Integer>(3));
		l1.getNext().setNext(new LinkedList<Integer>(5));
		LinkedList<Integer> currNode2 = l;
		while(currNode2.getNext() != null)
		{
			System.out.println(currNode2.getInfo());
			currNode2 = currNode2.getNext();
		}
		System.out.println(currNode2.getInfo());
		LinkedList2<Integer> m1 = new LinkedList2<Integer>(6);
		m.setNext(new LinkedList2<Integer>(1));
		m.getNext().setNext(new LinkedList2<Integer>(8)); //can't figure out why it's skipping over the 8....
		m.getNext().setNext(new LinkedList2<Integer>(9));
		
		LinkedList2<Integer> currNode3 = m;
		while(currNode3.getNext() != null)
		{
			System.out.println(currNode3.getInfo());
			currNode3 = currNode3.getNext();
		}
		System.out.println(currNode3.getInfo());
		
	}
}
