/*
 * COMP2080 Lab Test 1

 * Steven Moxley - 101047922
 */

package llclass;

public class LinkedList2<M> {
	private M info;
    private LinkedList2<M> next;
    
    public LinkedList2(M info) {
    	this.info = info;
    	this.next = null;
    }
    
	public M getInfo() {
		return info;
	}
	public void setInfo(M info) {
		this.info = info;
	}
	public LinkedList2<M> getNext() {
		return next;
	}
	public void setNext(LinkedList2<M> next) {
		this.next = next;
	}
	public LinkedList2<M> insert(LinkedList2<M> node) {
		node.next = this;
		return node;
	}
	
	
}