package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	T[] list;
	int length;
	
	public ArrayList() {
		length = 0;
		list = (T[]) new Object[length];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc]; 
	}

	public void add(T val) {
		length++;
		T[] tempList = list;
		
		list = (T[]) new Object[length];
		for(int i = 0; i < list.length - 1; i++) {list[i] = tempList[i];}
		
		list[length - 1] = val;
	
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		length++;
		T[] tempList = list;
		
		list = (T[]) new Object[length];
		for(int i = 0; i < loc; i++) {list[i] = tempList[i];}
		
		list[loc] = val;
		
		for(int i = loc + 1; i < list.length; i++) {list[i] = tempList[i - 1];}
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		length--;
		T[] tempList = list;
		
		list = (T[]) new Object[length];
		for(int i = 0; i < loc; i++) {list[i] = tempList[i];}
		
		for(int i = loc + 1; i < list.length; i++) {list[i] = tempList[i - 1];}
	}

	public boolean contains(T val) {

		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}