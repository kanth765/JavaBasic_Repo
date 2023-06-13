package com.ciq.generics;

public interface MyMap<K, V> {

	void myPut(K V);

	interface Entry<K, V> {

		K getKey();

		V getValue();
	}

}
