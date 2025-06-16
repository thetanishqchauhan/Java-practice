public class stackWithLL {

    public static void main(String[] args) {
        stack st = new stack();
        st.push(4);
        st.push(2);
        st.push(1);
        st.top();
        st.size();
        st.pop();
        st.top();
        st.size();
    }
}

// Implementation of Stack and Queue using Linked List

// stack using LL
class stack{

    // Creating Node for LL
    private class Node{
        int data;
        Node next;

        // Constructors
        Node(int data1){
            data = data1;
            next = null;
        }
    }

    // Creating the stack using these nodes of LL
    Node top;
    int size;

    stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int x){
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        System.out.println("Element pushed");
        size += 1;
    }

    public int pop(){
        int topData = top.data;
        top = top.next;
        size = size - 1;
        System.out.println("Element popped: ");
        return topData;
    }

    public int top(){
        System.out.println("Top of the stack: ");
        return top.data;
    }

    public int size(){
        System.out.println("Size of the stack: ");
        return size;
    }

}
