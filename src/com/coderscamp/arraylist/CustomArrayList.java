package com.coderscamp.arraylist;


public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;
	

	@Override
	public boolean add(T item) {
		if (size >= items.length) {
			Object [] newLength = new Object[(items.length * 2)];
			System.arraycopy(items, 0, newLength, 0, items.length);
            items = newLength;

		}
		items[size++] = item;


            return true;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@Override
	public T get(int index) {
		
		return (T) items[index];
	}
	
}