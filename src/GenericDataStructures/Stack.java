package GenericDataStructures;

import java.util.LinkedList;

public class Stack<T> {

	private LinkedList<T> list;
	public Stack(){
		list = new LinkedList<T>();
	}
	public void push(T t){
		list.addLast(t);
	}
	public T pop(){
		return list.getLast();
	}
}
