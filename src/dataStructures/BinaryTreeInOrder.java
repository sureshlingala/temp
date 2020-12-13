package dataStructures;

public class BinaryTreeInOrder {
	
	
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data =data;
		}
	}
	
	public static TreeNode creatBinaryTree(){
		
		TreeNode rootNode = new TreeNode(10);
		TreeNode Node2 = new TreeNode(20);
		TreeNode Node3 = new TreeNode(30);
		TreeNode Node4 = new TreeNode(40);
		TreeNode Node5 = new TreeNode(50);
		TreeNode Node6 = new TreeNode(60);
		TreeNode Node7 = new TreeNode(70);
		
		rootNode.left=Node2;
		rootNode.right=Node3;
		
		Node2.left = Node4;
		Node2.right = Node7;
		
		Node3.left = Node5;
		Node3.right = Node6;
		
		return rootNode;
	}
	
	public void inOrderTraverse(TreeNode Node){
		if(Node!=null){
			inOrderTraverse(Node.left);
			inOrderTraverse(Node.right);
			System.out.print(Node.data + " ");
		}
	}
	
	public static void main(String[] args){
		BinaryTreeInOrder btp = new BinaryTreeInOrder();
		TreeNode rootNode = creatBinaryTree();
		btp.inOrderTraverse(rootNode);
		
	} 
}
