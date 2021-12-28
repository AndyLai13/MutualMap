package com.andylai.mutualmap;

import java.util.HashMap;
import java.util.Objects;

public class MutualMap<K, V> extends HashMap<K, V> {
	public K getKeyByValue(V value) {
		for (Entry<K, V> entry : entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
}
