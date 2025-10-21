package InfinityChampionsProgram.Day10;

import java.util.ArrayList;
import java.util.List;

public class MinStack_1555 {
    
    int size = 0;
    private List<Integer> ll = new ArrayList<>();
    public MinStack_1555() {
        
    }
    
    public void push(int val) {
        ll.add(val);
        size++;
    }
    
    public void pop() {
        ll.remove(ll.size() - 1);
        size--;
    }
    
    public int top() {
        return ll.get(ll.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ll.size(); i++) {
            min = Math.min(min, ll.get(i));
        }
        return min;
    }
}
