package LinkedList;

public class TestLinkedList {
public static void main(String[] args){
	LinkedList list = new LinkedList();
	System.out.println("Trying get first and last");
	try {
		System.out.println(list.getFirstNode().getData());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	try {
		System.out.println(list.getLastNode().getData());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	list.addNode(new Node(1));
	list.addNode(new Node(12));
	list.addNode(new Node(13));
	list.addNode(new Node(14));
	System.out.println("BEFORE REVERSE");
	list.display();
	System.out.println(list.numberOfNodes());
	try {
		System.out.println("REVERSING");
		Node n =list.Reverse(list.getFirstNode());
		System.out.println(n.getData());
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	list.display();
	//list.deleteLastNode();
	
	list.deleteNode(3);
	list.display();
	System.out.println(list.numberOfNodes());
	
	System.out.println("Adding back 13");
	list.addNode(new Node(13),3);
	list.display();
	
	list.addNode(new Node(15),5);
	list.display();
	System.out.println(list.numberOfNodes());
	
	list.addNode(new Node(0),1);
	list.display();
	
	System.out.println("deleting head");
	list.deleteNode(1);
	list.display();
	
	list.deleteNode(5);
	list.display();
	
	System.out.println("Trying get first and last");
	try {
		System.out.println(list.getFirstNode().getData());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	try {
		System.out.println(list.getLastNode().getData());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("*************************Testing Stack ********************");
	Stack s=new Stack();
	s.push(2);
	s.push(4);
	s.push(6);
	//s.display();
	System.out.println(s.length());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	
	System.out.println("*************************Testing Queue ********************");
	Queue q=new Queue();
	q.enQueue(8);
	q.enQueue(10);
	q.enQueue(12);
	int l = q.length();
	for(int i=1; i<=l; i++){
		System.out.println(q.deQueue());
	}
	
}
}
