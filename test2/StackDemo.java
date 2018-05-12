package test2;

public class StackDemo {
	Node tail;
	int size=0;
	public static void main(String[] args) {
		StackDemo st=new StackDemo();
		st.push(121);
		st.push(141);
		st.push(122);
		st.push(142);
		System.out.println(st.pop());
		st.push(123);
		st.push(143);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.size);

	}
	
	public void push(Object o) {
		if(tail==null) {
			Node node=new Node(o);
			tail=node;
		}else {
			Node tempNode=new Node(o);
			tempNode.previous=tail;
			tail=tempNode;
		}
		size++;
	}
	
	public Object pop() {
		if(size==0) {
			throw new IllegalStateException("Stack is empty");
		}
		Node tempNode=tail;
		tail=tempNode.previous;
		tempNode.previous=null;
		size--;
		return tempNode.data;
	}
	
	class Node{
		Object data;
		Node previous;
		Node(Object data){
			this.data=data;
		}
		
		void setNext(Node previous) {
			this.previous=previous;
			
		}
	}

}
