package day5;

import java.util.Stack;

/**
 * 用两个栈实现一个队列
 */

class Solution {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    //入栈
    public void push(int node) {
        stack1.push(node);
    }

    //出栈
    public int pop() {
        while (!stack1.isEmpty()) {
            int tmp = stack1.peek();
            stack1.pop();
            stack2.push(tmp);
        }
        return stack2.pop();
    }
}



public class QueueByStack {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);
        solution.push(5);
        solution.push(6);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());

    }
}
