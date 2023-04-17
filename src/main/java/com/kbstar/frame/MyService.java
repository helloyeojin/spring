package com.kbstar.frame;

import java.util.List;

public interface MyService<K, V> {
    public void register(V v);
    public void remove(K k);
    public V get (K k);
    public List<V> get();
}

// 클래스 간의 dependency를 최소화하기 위해서 이러한 인터페이스를 사용
