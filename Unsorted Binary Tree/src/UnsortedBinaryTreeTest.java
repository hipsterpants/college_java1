import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Sean McDonald
 * May 2nd, 2014
 * CS 181 MWF 12:30pm
 *
 * @param <E> - the generic variable
 * 
 * This is the test for UnsortedBinaryTree. None of it works.
 */

public class UnsortedBinaryTreeTest<E> {
	public E data;
	public Node stuff;

	@Test
	public void testUnsortedBinaryTree() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		UnsortedBinaryTree testObject = new UnsortedBinaryTree();
		testObject.Node();
		Node testNode = new Node();
		assertEquals("I have no idea how to do this. :(");
	}

	@Test
	public void testSearch() {
		UnsortedBinaryTree testObject = new UnsortedBinaryTree();
		testObject.insert(data);
		assertEquals("true", testObject.search(data));
	}

}
