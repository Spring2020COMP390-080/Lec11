package lec11.list;

public class MyArrayList<T> implements List<T> {

	private Object[] _elements;
	private int _size;
	
	private static final int INIT_LENGTH = 10;
	
	public MyArrayList() {
		_elements = new Object[INIT_LENGTH];
		_size = 0;
	}

	@Override
	public int size() {
		return _size;
	}

	@Override
	public void add(int index, T element) {
		if (index < 0 || index > size()) {
			throw new RuntimeException("bad index");
		}

		if (size() == _elements.length) {
			Object[] bigger_array = new Object[size()*2];
			for (int i=0; i<size(); i++) {
				bigger_array[i] = _elements[i];
			}
			_elements = bigger_array;
		}
		
		for(int i=size(); i>index; i--) {
			_elements[i] = _elements[i-1];
		}
		_elements[index] = element;
		_size++;
	}

	@Override
	public T remove(int index) {
		if (index < 0 || index > size()) {
			throw new RuntimeException("bad index");
		}

		T element_removed = (T) _elements[index];
		
		for (int i=index; i<size()-1; i++) {
			_elements[i] = _elements[i+1];
		}
		_size--;
		// TODO Auto-generated method stub
		return element_removed;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index > size()) {
			throw new RuntimeException("bad index");
		}
		
		return (T) _elements[index];
	}
	
	
}
