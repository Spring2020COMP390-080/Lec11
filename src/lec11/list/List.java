package lec11.list;

public interface List<T> {

	// size
	// Returns the number of elements in the list.
	int size();						

	// isEmpty
	// Returns true if list is empty, false otherwise.
	default boolean isEmpty() {
		return (size() == 0);
	}
	
	// clear
	// Empties the list (i.e., removes all elements).
	default void clear() {
		while (!isEmpty()) {
			remove(0);
		}
	}
	
	// contains
	// Returns true if this list contains the specified element.
	default boolean contains(T element) {
		return (find(element) != -1);
	}
	
	// find
	// Returns index of first occurence of specified element
	// or -1 if not found.
	default int find(T element) {
		for(int i=0; i<size(); i++) {
			T e = get(i);
			if (e.equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	// add
	// Adds element to list.
	// First form adds element at end of list.
	// Second form adds element at specified position shifting
	// other elements over as necessary. Specified position must
	// be in the range of 0 and size (inclusive). 
	// Adding element at index size is the same as 
	// adding element at the end of list.
	default void add(T element) {
		add(size(), element);
	}
	void add(int index, T element);	
	
	// remove
	// Removes elements from list.
	// First form removes the first occurrence of the specified
	// element, returning true if found and false if not found.
	// If not found, list remains unchanged.
	// Second form removes element at specified position.
	// Position must be in the range of 0 to size-1. Returns
	// element at the specified position that was removed.
	default boolean remove(T element) {
		int index = find(element);
		if (index == -1) {
			return false;
		}
		remove(index);
		return true;
	}
	T remove(int index);			
	
	// get
	// Returns the element at the specified position in this list.
	// Position must be in the range between 0 and size-1.
	T get(int index);				
		
	// set
	// Replaces the element at the specified position in this list
	// with the specified element.
	// Specified position must be in range between 0 and size-1.
	// Returns element from list that was replaced.
	default T set(int index, T element) {
		if (index < 0 || index >= size()) {
			throw new RuntimeException("index out of bounds");
		}
		
		add(index, element);
		return remove(index+1);
	}
	
}
