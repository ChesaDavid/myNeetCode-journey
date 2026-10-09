class MinStack {
    private int[] stack;
    private int[] minStack;
    private int top;
    private int capacity;

    public MinStack() {
        this.capacity = 10;
        this.stack = new int[capacity];
        this.minStack = new int[capacity];
        this.top = -1;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            resize();
        }

        top++;
        stack[top] = val;

        if (top == 0) {
            minStack[top] = val;
        } else {
            minStack[top] = Math.min(val, minStack[top - 1]);
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
        }
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return minStack[top];
    }

  
    private void resize() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        int[] newMinStack = new int[capacity];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
            newMinStack[i] = minStack[i];
        }

        stack = newStack;
        minStack = newMinStack;
    }
}