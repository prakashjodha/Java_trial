package test2;

public class QueueDemo {
	Node root;
	Node node;
	int size=0;
	public static void main(String[] args) {
		QueueDemo st=new QueueDemo();
		st.enqueue(121);
		st.enqueue(141);
		st.enqueue(122);
		st.enqueue(142);
		System.out.println(st.dequeue());
		st.enqueue(123);
		st.enqueue(143);
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		st.enqueue(144);
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		st.enqueue(145);
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		st.enqueue(146);
		System.out.println(st.size);

	}
	
	public void enqueue(Object o) {
		if(node==null) {
			node=new Node(o);
			root=node;
		}else {
			Node tempNode=new Node(o);
			node.setNext(tempNode);
			node=tempNode;
		}
		size++;
	}
	
	public Object dequeue() {
		if(size==0) {
			throw new IllegalStateException("Stack is empty");
		}
		Node tempNode=root;
		if(root==node) {
			node=null;
		}
		root=tempNode.next;
		tempNode.next=null;
		size--;
		return tempNode.data;
	}
	
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
		
		void setNext(Node next) {
			this.next=next;
			
		}
	}

}
