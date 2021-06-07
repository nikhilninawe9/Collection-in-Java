package Stack;

public class StackImplementationUsingArray {

	// Stack implementation in java using arrays

	private int size;
	private int arr[];
	private int top;

	public StackImplementationUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return size - 1 == top;
	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed Element: " + element);
		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnTop = top;
			top--;
			System.out.println("Poped element: " + arr[returnTop]);
			return arr[returnTop];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public static void main(String[] args) {
		StackImplementationUsingArray s = new StackImplementationUsingArray(10);
		s.pop();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.pop();// Poped element: 400
		s.pop();// Poped element: 300
		s.pop();// Poped element: 200
		s.peek();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
	}

}
