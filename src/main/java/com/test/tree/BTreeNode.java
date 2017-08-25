package com.test.tree;

public class BTreeNode<K extends Comparable, V>
{
    public final static int MIN_DEGREE          =   5;
    public final static int LOWER_BOUND_KEYNUM  =   MIN_DEGREE - 1;
    public final static int UPPER_BOUND_KEYNUM  =   (MIN_DEGREE * 2) - 1;

    protected boolean mIsLeaf;
    protected int mCurrentKeyNum;
    protected BTreeKeyValue<K, V> mKeys[];
    protected BTreeNode mChildren[];


    public BTreeNode() {
        mIsLeaf = true;
        mCurrentKeyNum = 0;
        mKeys = new BTreeKeyValue[UPPER_BOUND_KEYNUM];
        mChildren = new BTreeNode[UPPER_BOUND_KEYNUM + 1];
    }


    protected static BTreeNode getChildNodeAtIndex(BTreeNode btNode, int keyIdx, int nDirection) {
        if (btNode.mIsLeaf) {
            return null;
        }

        keyIdx += nDirection;
        if ((keyIdx < 0) || (keyIdx > btNode.mCurrentKeyNum)) {
            return null;
        }

        return btNode.mChildren[keyIdx];
    }


    protected static BTreeNode getLeftChildAtIndex(BTreeNode btNode, int keyIdx) {
        return getChildNodeAtIndex(btNode, keyIdx, 0);
    }


    protected static BTreeNode getRightChildAtIndex(BTreeNode btNode, int keyIdx) {
        return getChildNodeAtIndex(btNode, keyIdx, 1);
    }


    protected static BTreeNode getLeftSiblingAtIndex(BTreeNode parentNode, int keyIdx) {
        return getChildNodeAtIndex(parentNode, keyIdx, -1);
    }


    protected static BTreeNode getRightSiblingAtIndex(BTreeNode parentNode, int keyIdx) {
        return getChildNodeAtIndex(parentNode, keyIdx, 1);
    }
}
