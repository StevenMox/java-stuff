package ca.comp2080.labtestb.list;

public class MyList<T> {
	private T value;
	private MyList<T> next;

	public T setValue(T v) {
		value = v;
		return v;
	}

	public MyList<T> setNext(MyList<T> n) {
		next = n;
		return next;
	}

	public T getValue() {
		return value;
	}

	public MyList<T> getNext() {
		return next;
	}

	// A is a node within the owner. This method adds X after the node A.
	public void addAfter(MyList<T> a, T x) {
		MyList<T> n = new MyList<T>();
		n.value = x;
		n.next = a.next;
		a.next = n;
	}

	// Last node.
	public MyList<T> last() {
		MyList<T> n = this;
		while (n.next != null)
			n = n.next;
		return n;
	}

	// Add X to the tail of the list.
	public void addLast(T x) {
		addAfter(last(), x);
	}

	public String toString() {
		MyList<T> a = next;
		String s = "[";
		while (a != null) {
			s = s + a.value.toString() + " ";
			a = a.next;
		}
		return s + "]";
	}

	public void swap(int n) {
		// preconditions: none
		// postconditions: method takes an integer (n), then performs a swap,
		// swapping element n with n+1 on caller list.

		int i = 0;
		//pB pointer before nth element
		MyList<T> pB = this;
		//pC pointer to nth element
		MyList<T> pC = this.next;
		while (pC != null && i < n) {
			pB = pC;
			pC = pC.next;
			i++;
		}

		if (pC != null && pC.next != null) {
			System.out.println("Performing swap ...");
			pB.next = pC.next;
			pC.next = pC.next.next;
			pB.next.next = pC;
	
		} else {
			System.out.println("Cannot perform swap, either n or n+1 element does not exist.");
		}

	}

}
