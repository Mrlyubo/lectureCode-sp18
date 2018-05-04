 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {	
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		
		}
	} 


	private IntNode first;
	private int size;



	public SLList(int x) {
		first = new IntNode(x, null);
		size = 1;
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		first = new IntNode(x, first);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return first.item;
 	}

	
 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
 		size = size + 1; 		
 		IntNode p = first;
 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}
 		p.next = new IntNode(x, null);
 	}
	
	/** Rerurns the size of IntNodeList that start at IntNode p.*/
	private static int size(IntNode p){
		if (p.next == null){
			return 1;
		}
		return 1+size(p.next);
	}
 	
 	/** Returns the size of the list. */
 	public int size() {
 		return size;
 	}

	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
 		SLList L = new SLList(3);
 		L.addLast(5);
		L.addFirst(10);
		L.addFirst(2);
 		System.out.println(L.size());
 	}
}