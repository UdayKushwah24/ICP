package InfinityChampionsProgram.Day10;

import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingQueue_225 {
    List<Integer> ll = new ArrayList<>();
    int size = -1;

    public ImplementStackUsingQueue_225() {

    }

    public void push(int x) {
        ll.add(x);
        size++;
    }

    public int pop() {
        int rv = ll.remove(size);
        size--;
        return rv;
    }

    public int top() {
        return ll.get(size);
    }

    public boolean empty() {
        return size == -1;
    }
}
