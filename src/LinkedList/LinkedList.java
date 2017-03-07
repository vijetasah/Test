package LinkedList;

import java.util.ArrayList;

public class LinkedList {
private Node head;

private int count;
public LinkedList(){
	head=null;
	count=0;
}
public void addNode(Node newNode){
	if(head==null){
	//	System.out.println("if");
		head=newNode;
	}
	else{
		//System.out.println("else");
		Node temp=head;
		while (temp.getNext()!=null){
			temp=temp.getNext();
		}
		temp.setNext(newNode);
	}
	//System.out.println(head.getData());
	count++;
}

public void display(){
	Node temp=head;
	while (temp.getNext()!=null){
		System.out.println(temp.getData());
		temp=temp.getNext();
	}
	System.out.println(temp.getData());
}

public void deleteLastNode(){
	Node temp=head;
	if(temp.getNext()==null){
		head=null;
	}
	else{
	while (temp.getNext().getNext()!=null){
		temp=temp.getNext();
	}
	temp.setNext(null);
	}
	count--;
}
public int numberOfNodes(){
	return count;
}

public void deleteNode(int index){
	Node temp=head;
	Node previousNode=head;
	if(index==1){
		head=temp.getNext();
	}
	else{
		for(int i=1; i<index; i++){
			previousNode=temp;
			temp=temp.getNext();
		}
		previousNode.setNext(temp.getNext());
	}
	count--;
}

public void addNode(Node newNode, int index){
	Node temp=head;
	Node previousNode=head;
	if(index==1){
		head=newNode;
		head.setNext(previousNode);
	}
	else{
		for(int i=1; i<index; i++){
			previousNode=temp;
			temp=temp.getNext();
		}
		previousNode.setNext(newNode);
		newNode.setNext(temp);
	}
	count++;
}
public Node getFirstNode() throws Exception{
	if(head==null){
		throw new Exception("The linked list is empty");
	}
	else{
			return head;
	}
}
public Node getLastNode() throws Exception{
	if(head==null){
		throw new Exception("The linked list is empty");
	}
	else{
			Node temp=head;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			return temp;
	}
}
public Node Reverse(Node head) {
    Node temp=head.getNext();
    Node temp1=temp.getNext();
    //If List is empty
    if(head==null){
        System.out.println("List is empty");
        return null;
    }
    //If only one element in Linked List
    else if(temp==null){
        return head;
    }
    //If multiple elements in list
    else{
        while(temp!=null){
            temp.setNext(head);
            if((temp.getNext()).getNext()==null){
                head.setNext(null);
            }
            head=temp;
            temp=temp1;
            temp1=temp1.getNext();
        }
        return head;
    }
}

}
