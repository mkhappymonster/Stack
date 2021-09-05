package stack;

public class stack_cl {
	int top;
	int arr[];
	int max;

	public stack_cl(int size) {
		super();
		top = -1;
		arr = new int[size];
		max = size;
	}
	public int size() {
		System.out.println("size :" + (top+1));
	    return top + 1;
	  }

	void push(int Element) {
		if (top + 1 == max) {
			System.out.println("Can't push");
		} else {
			System.out.println("Push : " + Element);
			++top;
			arr[top] = Element;
		}
	}

	int pop() {
		if (top == -1) {
			System.out.println("STACK EMPTY");
		}else {
			System.out.println("poping : " + arr[top--]);
		
		}
		return 1 ;
	}

	Boolean isEmpty() {
		return top == -1;
	}

	int gettop() {
		
		System.out.print("top :" + arr[top]);
		return arr[top];
	}

	void print() {
		for (int i = top; i >= 0; i--) {
			System.out.println("Print elements : {" + arr[i] + "}");
		}
	}

}
