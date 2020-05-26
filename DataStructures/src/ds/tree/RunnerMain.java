package ds.tree;

public class RunnerMain {
	
	public static void main(String[] args) {
		MyBinaryTree tree=new MyBinaryTree();
		tree.addNode(50, "Kishan");
		tree.addNode(75, "Rupika");
		tree.addNode(85, "Neha");
		tree.addNode(30, "Jyotika");
		tree.addNode(25, "Kritika");
		tree.addNode(15, "Swati");
		
		tree.inOrderTraversal(tree.root);
		System.out.println("---------------");
		tree.preOrderTraversal(tree.root);
		System.out.println("---------------");
		tree.postOrderTraversal(tree.root);
		System.out.println("---------------");
		System.out.println(tree.findNode(85));
	}

}
