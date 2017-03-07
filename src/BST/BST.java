package BST;

public class BST {
private Node root;
public BST(){
	this.root=null;
}

public Node insert(Node root, int value){
	Node n = new Node(value);
	Node current=root;
	//case 1: If tree is empty
	if(root==null) {
		root=n;
		return root;
	}
	//Tree is not empty
	else{
		while(true){
		//Insert on left side
		if(value<current.data){
			//If left tree is empty then insert
			if(current.left==null){
				current.left=n;
				break;
			}
			//Else current is left subtree
			else{
				current=current.left;
			}
		}
		if(value>current.data){
			//If right tree is empty then insert
			if(current.right==null){
				current.right=n;
				break;
			}
			//Else current is right subtree
			else{
				current=current.right;
			}
		}
	}
		return root;
	}
	
	
}
}
