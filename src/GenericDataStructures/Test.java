package GenericDataStructures;

public class Test {
public static void main(String[] args){
	Stack<String> sStr=new Stack<>();
	sStr.push("hi");
	sStr.push("there!");
	System.out.println(sStr.pop());
	System.out.println(sStr.pop());
	
	Stack<Integer> sInt=new Stack<>();
	sInt.push(1);
	sInt.push(2);
	System.out.println(sInt.pop());
	
	
	System.out.println("Generic Linked List");
	LinkedList<String> l= new LinkedList<>();
	Node<String> n = new Node<>("hi");
	Node<String> an = new Node<>("there");
	l.addNode(n);
	l.addNode(an);
	l.display();
}
}
