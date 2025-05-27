package lab_09;
import java.util.Arrays;

import java.util.ArrayList;
interface StackOperations{
    void push(int x);
    int pop();
    boolean isEmpty();
    int size();
}


class FixedStack implements StackOperations{
    private int[] StackArray;
    private int top;
    private int size;

    public FixedStack(int size){
        this.size = size;
        this.top = -1;
        this.StackArray = new int[size];


    }

    @Override
    public void push(int x){
        if(top == size-1){
            System.out.println("Stack is full");
        }
        StackArray[++top] = x;
        System.out.println("Stack pushed: " + x);
    }

    @Override
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        int x = StackArray[top--];

        return x;
    }

    @Override
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    @Override
    public int size(){
        return size+1;
    }
}

class DynamicStack implements StackOperations{
    private int[] StackArray;
    private int top;
    private int capacity;

    public DynamicStack(){
        this.top = -1;
        this.capacity = 16;
        this.StackArray = new int[capacity];
    }

    @Override
    public void push(int x){
        if(top==capacity-1){
            int newCapacity = capacity*2;
            StackArray = Arrays.copyOf(StackArray,newCapacity);
            capacity = newCapacity;

        }
        StackArray[++top] = x;
        System.out.println("Stack pushed: " + x);
    }

    @Override
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        int x = StackArray[top--];
        return x;
    }

    @Override
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }


    @Override
    public int size(){
        return top+1;
    }
}

public class Stack {
    public static void main(String[] args) {
        FixedStack fs = new FixedStack(5);
        DynamicStack ds = new DynamicStack();

        fs.push(10);

        fs.push(20);

        fs.pop();

        ds.push(69);
        ds.push(30);
        ds.pop();
    }
}
