package com.j2h.iterator;

//抽象迭代器角色:遍历集合中元素
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}