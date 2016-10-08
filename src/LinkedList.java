
public class LinkedList {
//	private class Node{
//		Node next;
//		int data;
//		public Node(int val){
//			data=val;
//			next=null;
//		}
//	}
	int data;
	LinkedList next;
	private LinkedList(int val){
		data=val;
		next=null;
	}
	public LinkedList(){
		this.data=0;
		this.next=new LinkedList(1);
		this.next.next=new LinkedList(2);
	}
	public void insert(int val){
		LinkedList iter=this;
		if(iter.next==null){
			iter.next=new LinkedList(val);
			return;
		}
		else{
			System.out.println("Current: "+iter.data+","+iter.next.data);
			iter.next.insert(val);
		}
	}
	public void traverse(){
		LinkedList iter=this;
		while(iter!=null){
			System.out.println(iter.data);
			iter=iter.next;
		}
	}
}
