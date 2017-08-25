package com.test.tree;


public class BTree<K extends Comparable, V>{
      private BTreeNode<K, V> mRoot = null;
    private int  mSize = 0;

    public static void main(String[] args) {
        BTree<Integer, String> btree = new BTree<>();

    }

    //
    // Get the root node
    //
    public BTreeNode<K, V> getRootNode() {
        return mRoot;
    }


    //
    // The total number of nodes in the tree
    //
    public long size() {
        return mSize;
    }


    //
    // Clear all the entries in the tree
    //
    public void clear() {
        mSize = 0;
        mRoot = null;
    }


    //
    // Create a node with default values
    //
    private BTreeNode<K, V> createNode() {
        BTreeNode<K, V> btNode;
        btNode = new BTreeNode();
        btNode.mIsLeaf = true;
        btNode.mCurrentKeyNum = 0;
        return btNode;
    }

       //
    // Insert key and its value into the tree
    //
    public BTreeStruct insert(K key, V value) {
    }

    //
    // Split a child with respect to its parent at a specified node
    //
    private void splitNode(BTreeNode parentNode, int nodeIdx, BTreeNode btNode) {
    }

    //
    // Search value for a specified key of the tree
    //
    public V search(K key) {
        return null;
    }

}

