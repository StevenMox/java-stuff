package ca.comp2080.labtestb.stack;

public class DualStack {
	private final int DEFAULT_CAPACITY = 4;
	public Object DualArray[];
	private int topOfStackA; // top of stack pointer for stackA
	private int topOfStackB; // top of stack pointer for stackB

	// Constructor and class variables initialization
	public DualStack() {
		DualArray = new Object[DEFAULT_CAPACITY];
		topOfStackA = -1;
		topOfStackB = DualArray.length;
	}

	// Sum of the sizes of stack 1 and stack 2.
	public int size() {
		return ((topOfStackA + 1 + DualArray.length - topOfStackB));
	}

	// When both the stacks together cover up the entire array
	public boolean isFull() {
		return (size() == DualArray.length);		
	}

	// When the stacks are empty
	public boolean isEmptyA() {
		return ((topOfStackA == -1));
	}

	// When the stacks are empty
	public boolean isEmptyB() {
		return ((topOfStackB == DualArray.length));
	}

	// Push the item into stackA
	public void pushA(Object item) {
		if (!isFull()) {
			DualArray[++topOfStackA] = item;
			System.out.println("Item pushed onto stack (A)");
		} else {
			System.out.println("Stack (A) is full!");
		}
	}

	// Push the item into stackB
	public void pushB(Object item) {
		if (!isFull()) {
			DualArray[--topOfStackB] = item;
			System.out.println("Item pushed onto stack (B)");
		} else {
			System.out.println("Stack (B) is full!");
		}
	}

	// Pop the top item from stackA
	public Object popA() {
		if (!isEmptyA()){
			System.out.println("Pop stack (A)");
			return (DualArray[topOfStackA--]);
		}else
			return null;
	}

	// Pop the top item from stackB
	public Object popB() {
		if (!isEmptyB()){
			System.out.println("Pop stack (B)");
			return (DualArray[topOfStackB++]);
		}else
			return null;
	}
}