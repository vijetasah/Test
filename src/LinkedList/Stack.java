package LinkedList;

public class Stack {
	private AdvancedLinkedList list;
	public Stack(){
		list = new AdvancedLinkedList();
	}
	public void push(int data){
		list.addLast(data);
	}
	public int pop(){
		int d= list.getLast();
		list.deleteLastNode();
		return d;
	}
	public int length(){
		return list.numberOfNodes();
	}
	public void display(){
		list.display();
	}
}
