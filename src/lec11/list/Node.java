package lec11.list;

public interface Node<T> {

	T getValue();
	void setValue(T value);
	Node<T> getNext();
	void setNext(Node<T> next);
}
