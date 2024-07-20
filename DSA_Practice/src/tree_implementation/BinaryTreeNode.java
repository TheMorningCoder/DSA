package tree_implementation;

public class BinaryTreeNode <T>{
	T data;
	BinaryTreeNode<T>leftNode;
	BinaryTreeNode<T>rightNode;
	public BinaryTreeNode(T data) {
		this.data=data;
		rightNode=null;
		leftNode=null;
	}
}
