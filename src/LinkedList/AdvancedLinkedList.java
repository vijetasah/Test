package LinkedList;

public class AdvancedLinkedList extends LinkedList{
	public void addLast(int  data){
		addNode(new Node(data));
	}
	public int getFirst(){
		int d=0;
		try {
			 d=getFirstNode().getData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}
	public int getLast(){
		int d=0;
		try {
			 d=getLastNode().getData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}
}
