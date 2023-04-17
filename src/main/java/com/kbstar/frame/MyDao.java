package com.kbstar.frame;

import java.util.List;

public interface MyDao<K,V> {
    // 인터페이스 = 기능 정의
    public void insert(V v);
    public void delete(K k);
    public void select(K k);
    public List<V> select();
}
