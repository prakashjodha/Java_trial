package trial;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayToBST {

	static Node root=null;
	public static void main(String[] args) {
		int[] intArray=new int[] {4,9,10,1,6,12,8};
		Node node=root;
		for (int i : intArray) {
			node=root;
			fillBst(node,i);
			
		}
		if(root!=null) {
		root.printBfs();
		}else {
			 System.out.println("Empty ");

		}
		
	}
	
	public static  void fillBst(Node node,int val) {
		if(node==null) {
			node=new Node();
			node.data=val;
			root=node;
		}else {
			if(node.data<val) {
				if(node.left==null) {
					Node leftNode=new Node();
					leftNode.data=node.data;
					node.data=val;
					node.left=leftNode;
				}else if(node.right==null) {
					Node rightNode=new Node();
					rightNode.data=val;
					node.right=rightNode;
				}else {
					fillBst(node.right,val);
				}
				
			}else {
				if(node.left==null) {
					Node leftNode=new Node();
					leftNode.data=val;
					//node.data=val;
					node.left=leftNode;
				}else {
					fillBst(node.left,val);
				}
			}
		}
		
	}
}

class Node{
	 int data;
	 Node left;
	 Node right;
	 
	 public void printBfs() {
		 Queue< Node> queue=new LinkedList<>();
		 queue.add(this);
		 while(!queue.isEmpty()) {
			 Node node = queue.poll();
			 System.out.println(node.data);
			 if(node.left!=null)
			 queue.add(node.left);
			 if(node.right!=null)
				queue.add(node.right);
		 }
	 }
	
}
