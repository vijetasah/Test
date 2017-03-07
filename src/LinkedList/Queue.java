package LinkedList;

public class Queue {
	private AdvancedLinkedList list;
	public Queue(){
		list = new AdvancedLinkedList();
	}
	public void enQueue(int data){
		list.addLast(data);
	}
	public int deQueue(){
		int d= list.getFirst();
		list.deleteNode(1);
		return d;
	}
	public int length(){
		return list.numberOfNodes();
	}
	public void display(){
		list.display();
	}
}
