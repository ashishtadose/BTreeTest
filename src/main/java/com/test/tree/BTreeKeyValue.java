package com.test.tree;

public class BTreeKeyValue<K extends Comparable, V>
{
    protected K mKey;
    protected V mValue;

    public BTreeKeyValue(K key, V value) {
        mKey = key;
        mValue = value;
    }
}
