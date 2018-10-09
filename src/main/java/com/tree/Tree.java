package com.tree;

/**
 * Created by kaolafm on 2018/10/9.
 *
 * @author zhangyz
 */
public class Tree {
	private Node root;            // the only data field in Tree

	public Node find(int key) {        // find node with given key
		// (assumes non - empty tree)
		Node current = root;                // start at root
		while (current.iData != key) {        // while no match,
			if (key < current.iData) {            // go left?
				current = current.leftChild;
			} else {
				current = current.rightChild;    // or go right?
			}
			if (current == null) {                // if no child,
				return null;                    // didn't find it
			}
		}
		return current;                            // found it
	}

	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (id < current.iData){
					current = current.leftChild;
				}
			}
		}
	}

	public void delete(int id) {

	}
	// various other methods
}    // end class Tree
