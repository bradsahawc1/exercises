class Stack {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public Stack() {
        this(DEFAULT_CAPACITY); // set default capacity
    }

    /** Construct a stack with the specified maximum capacity */
    public Stack(int capacity) {
        elements = new int[capacity];
    }

    /** Push a new integer into the top of the stack */
    public void push(int value) {
        if (size < elements.length) {
            elements[size++] = value;
        }
    }

    /** Return and remove the top element from the stack */
    public int pop() {
        return elements[--size];
    }

    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }

    /** Test whether the stack is empty */
    public boolean empty() {
        return size == 0;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}

public class StackTest {
    public void test1() {
        Stack s = new Stack();
        s.push(1);
        System.out.println("1.1: " + (s.peek() == 1));
        System.out.println("1.2: " + (s.empty() == false));
        System.out.println("1.3: " + (s.getSize() == 1));
        s.pop();
        System.out.println("1.4: " + (s.empty() == true));
    }
    public void test2() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println("2.1: " + (s.peek() == 2));
        System.out.println("2.2: " + (s.empty() == false));
        System.out.println("2.3: " + (s.getSize() == 2));
        s.pop();
        System.out.println("2.4: " + (s.peek() == 1));
        System.out.println("2.5: " + (s.empty() == false));
        System.out.println("2.6: " + (s.getSize() == 1));
        s.pop();
        System.out.println("2.7: " + (s.empty() == true));
    }
    
    public static void main(String[] args) {
        StackTest t = new StackTest();
        t.test1();
        t.test2();
    }
}

/**
 * output
 1.1: true
 1.2: true
 1.3: true
 1.4: true
 2.1: true
 2.2: true
 2.3: true
 2.4: true
 2.5: true
 2.6: true
 2.7: true
 */