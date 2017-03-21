package stacksqueues;

import java.util.Scanner;
import java.util.Stack;

public class QueueFromTwoStacks
{
    public static void main(String[] args)
    {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T>
{
    private Stack<T> s1 = new Stack<>();

    private Stack<T> s2 = new Stack<>();

    public void enqueue(T value)
    {
        int size  = s2.size();
        for (int i = 0; i < size; i++) {
            s1.push(s2.pop());
        }

        s1.push(value);
        size = s1.size();
        for (int i = 0; i < size; i++) {
            s2.push(s1.pop());
        }
    }

    public T dequeue()
    {
        return s2.pop();
    }

    public T peek()
    {
        return s2.peek();
    }
}
