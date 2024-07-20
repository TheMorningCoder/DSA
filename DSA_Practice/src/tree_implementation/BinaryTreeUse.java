package tree_implementation;

import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeTreeInput();
		printBinaryTree(root);
		
	}
	static BinaryTreeNode <Integer> takeTreeInput() {
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
		BinaryTreeNode<Integer> leftNode=takeTreeInput();
		BinaryTreeNode<Integer> rightNode=takeTreeInput();
		root.leftNode=leftNode;
		root.rightNode=rightNode;
		return root;	
	}
	
	static void printBinaryTree(BinaryTreeNode<Integer> root ) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		if(root.leftNode!=null) {
			System.out.print("L: "+root.leftNode.data);
		}
		if(root.rightNode!=null) {
			System.out.print("R: "+root.rightNode.data);
		}
		System.out.println();
		printBinaryTree(root.leftNode);
		printBinaryTree(root.rightNode);
	}
}
