
/**
 * @author Sean McDonald
 * May 2nd, 2014
 * CS 181 MWF 12:30pm
 * 
 * @param <E> the generic variable
 * 
 * This class is an unsorted binary tree that can insert new nodes and search for specific information.
 * 
 * root - the root Node for the tree
 * generic - the generic variable
 * rightDepth - the integer storing the right depth of the tree
 * leftDepth - the integer storing the left depth of the tree
 * 
 * Sorry, I have no idea how to do this.
 */

public class UnsortedBinaryTree<E> {
	
	private Node root;
	private E generic;
	private int rightDepth;
	private int leftDepth;
	
	
	/**
	 * The constructor that sets the root to null
	 */
	
	public UnsortedBinaryTree()
	{
		root = null;
	}
	
	/**
	 * @param generic - the generic variable for data to be inserted into the tree
	 * 
	 * This method inserts new data nodes into the binary tree.
	 */
	
	public void insert(E generic)
	{
		Node newNode = new Node();
		newNode.data = generic;
		newNode.left = null;
		newNode.right = null;
		if (root == null)
		{
			root = newNode;
		}
		else
		{
			root.addNode(newNode);
		}
		
	}

	/**
	 * @param generic - the data of the generic variable to be stored in the tree
	 * 
	 * @return - returns a boolean value to determine if the search is successful or not
	 * 
	 * This method searches the binary search tree for data and returns a boolean depending on the success
	 */
	
	public boolean search(E generic)
	{
		Node check = root;
		while (check != null)
		{
			if (leftDepth == 0 && rightDepth == 0)
			{
				return true;
			}
			else if (leftDepth > 0)
			{
				check = check.left;
			}
			else
			{
				check = check.right;
			}
			return false;
		}
		return false;
	}
	
	/**
	 * @author Sean McDonald
	 * 
	 * This method creates a Node class to be used for the binary search tree
	 *
	 * data - the generic variable
	 * left - the left node
	 * right - the right node
	 *
	 */
	
	class Node
	{
		public E data;
		public Node left;
		public Node right;
		
		/**
		 * @param newNode - a newly created node
		 * 
		 * This method adds a node based on whether the tree is balanced or not.
		 */
		
		public void addNode(Node newNode)
		{
			if (leftDepth > 0)
			{
				if (left == null)
				{
					left = newNode;
					leftDepth++;
				}
				else
				{
					left.addNode(newNode);
				}
			}
			else if (rightDepth > 0)
			{
				if (right == null)
				{
					right = newNode;
					rightDepth++;
				}
				else
				{
					right.addNode(newNode);
				}
			}
		}
	}
}
