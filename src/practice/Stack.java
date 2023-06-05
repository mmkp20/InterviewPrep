package practice;

public class Stack {
    int top;
    static int[] stackArr;
    private void Stack(){
        this.top=-1;
    }

    public static void main (String[] args) {
        Stack stack = new Stack();
        stackArr= new int[5];
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int poppedNum = stack.pop();
        System.out.println("pop() :"+poppedNum);

        int topNum = stack.peek();
        System.out.println("peek() :"+topNum);
        poppedNum = stack.pop();
        System.out.println("pop() :"+poppedNum);
    }

    private int peek () {
        return stackArr[top];
    }

    private int pop () {
        int result=stackArr[top];
        top--;
        return result;
    }

    private void push (int num){
        top++;
        stackArr[top]=num;
    }
}
