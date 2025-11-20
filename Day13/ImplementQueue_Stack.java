package InfinityChampionsProgram.Day13;

import java.util.ArrayList;
import java.util.List;

public class ImplementQueue_Stack {
    class MyQueue {
    List<Integer> ll = new ArrayList<>();
    int size = -1;
    int front = 0;

    public MyQueue() {

    }

    public void push(int x) {
        ll.add(x);
        size++;
    }

    public int pop() {
        int rv = ll.get(front);
        front++;
        size--;
        return rv;
    }

    public int peek() {
        return ll.get(front);
    }

    public boolean empty() {
        return size == -1;

    }
}

}
