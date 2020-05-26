package ds.tree;

public class TreeNode {
	
	int key;
	String name;
	
	TreeNode leftNode;
	TreeNode rightNode;
	
	public TreeNode(int key,String name) {
		this.key=key;
		this.name=name;
	}
	
	public String toString() {
		return name+" has a "+key;
	}

}
