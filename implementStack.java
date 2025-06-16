public class implementStack {

    public static void main(String[] args) {
        // // stack using array
        // stack s = new stack();
        // s.push(7);
        // s.push(8);
        // s.push(9);
        // System.out.println("Deleted value: " + s.pop());
        // System.out.println("Value at top: " + s.top());
        // s.pop();

        // // queue using array
        // queue q = new queue();
        // q.push(6);
        // q.push(8);
        // q.push(10);
        // System.out.println("Deleted value: " + q.pop());
        // System.out.println("Value at top: " + q.top());
    }
    
}

// Implementation of Stack and queue using arrays

// stack using array
class stack{
    
    int arr[] = new int[10];
    int top = -1;

    void push(int x){
        top = top +  1;
        arr[top] = x;
    }

    int pop(){
        int x = arr[top];
        top = top - 1;
        return x;
    }

    int top(){
        return arr[top];
    }

    int size(){
        return top + 1;
    }
    
}

// queue using array
class queue {
    int size = 10;
    int arr[] = new int[size];
    int top = size - 1;
    int current = size;

    void push(int x){
        current -= 1;
        arr[current] = x;
    }

    int pop(){
        int x = arr[top];
        top -= 1;
        return x;
    }

    int top(){
        return arr[top];
    }
    
}