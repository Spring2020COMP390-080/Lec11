package lec11.list;

public class MyLinkedList<T> implements List<T> {

	private Node<T> _head;
	private int _size;
	
	public MyLinkedList() {
		_head = null;
		_size = 0;
	}
	
	@Override
	public int size() {
		return _size;
	}

	@Override
	public void add(int index, T element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0) {
			Node<T> added_node = new NodeImpl<T>(element, _head);
			_head = added_node;
		} else {
			Node<T> prior_node = walk_to(index-1);
			Node<T> added_node = new NodeImpl<T>(element, prior_node.getNext());
			prior_node.setNext(added_node);
		}
		_size++;
	}

	@Override
	public T remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<T> removed = null;
		if (index == 0) {
			removed = _head;
			_head = _head.getNext();
		} else {
			Node<T> prior_node = walk_to(index-1);
			removed = prior_node.getNext();
			prior_node.setNext(removed.getNext());
		}
		return removed.getValue();
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		Node<T> node = walk_to(index);
		
		return node.getValue();
	}

	private Node<T> walk_to(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();			
		}
		
		int counter = 0;
		Node<T> current = _head;
		
		while (counter != index) {
			counter++;
			current = current.getNext();
		}
		return current;
	}
}
