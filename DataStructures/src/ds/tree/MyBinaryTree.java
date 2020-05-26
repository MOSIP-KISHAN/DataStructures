package ds.tree;

public class MyBinaryTree {
	
	TreeNode root;
	
	public void addNode(int key, String name) {
		TreeNode newNode=new TreeNode(key, name);
		if(root==null) {
			root=newNode;
		}
		else {
			 TreeNode focusNode=root;
			 TreeNode parent;
			 while(true) {
				 parent=focusNode;
				 if(key<focusNode.key) {
					 focusNode=focusNode.leftNode;
					 if(focusNode==null) {
						 parent.leftNode=newNode;
						 return;
					 }
				 }
				 else{
					focusNode=focusNode.rightNode;
					if(focusNode==null) {
						parent.rightNode=newNode;	
						return;
					}
				 }
			 }
		}
	}

	public void inOrderTraversal(TreeNode root) {
		if(root!=null) {
			inOrderTraversal(root.leftNode);
			System.out.println(root);
			inOrderTraversal(root.rightNode);
		}
	}
	public void preOrderTraversal(TreeNode root) {
		if(root!=null) {
			System.out.println(root);
			preOrderTraversal(root.leftNode);
			preOrderTraversal(root.rightNode);
		}
	}
	public void postOrderTraversal(TreeNode root) {
		if(root!=null) {
			postOrderTraversal(root.leftNode);
			postOrderTraversal(root.rightNode);
			System.out.println(root);
		}
	}
	
	public TreeNode findNode(int  key) {
		TreeNode focus=root;
		while(root.key!=key) {
			
			if(key<root.key) {
				focus=focus.leftNode;
			}
			else if(key>root.key){
				focus=focus.rightNode;
			}
			if(focus==null) 
				return null;
		}
		return focus;
	}
}
