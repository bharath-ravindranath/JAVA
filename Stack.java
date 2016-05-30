import java.util.Scanner;

class Stack{
	private int stack[];
	private int topOfStack;

	Stack(int size){
		this.topOfStack = -1;
		this.stack = new int[size];
	}

	void push(int value){
		if(((this.stack).length - 1) == this.topOfStack)
			System.out.println("Stack full");
		else this.stack[++this.topOfStack] = value;
	}

	int pop(){
		if(this.topOfStack == -1){
			System.out.println("Stack Empty");
			return -1;
		}

		else
			return(this.stack[this.topOfStack--]);
	}
}

class testStack{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		int n = reader.nextInt();

		Stack stack1 = new Stack(n);
		System.out.println("Enter " + n + " numbers");

		for(int i = 0; i < n; i++)
			stack1.push(reader.nextInt());

		System.out.println("Stack elements are");
		for (int i = 0; i < n; i++)
			System.out.println(stack1.pop());
	}
}