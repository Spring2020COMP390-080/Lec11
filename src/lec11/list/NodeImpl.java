package lec11.list;

public class NodeImpl<T> implements Node<T> {
	
	private T _value;
	private Node<T> _next;
	
	public NodeImpl(T value, Node<T> next) {
		_value = value;
		_next = next;
	}
	
	public T getValue() {
		return _value;
	}
	
	public void setValue(T value) {
		_value = value;
	}
	
	public Node<T> getNext() {
		return _next;
	}
	
	public void setNext(Node<T> next) {
		_next = next;
	}

}
