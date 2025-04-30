public class implementStack {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(7);
        s.push(8);
        s.push(9);
        System.out.println("Deleted value: " + s.pop());
        System.out.println("Value at top: " + s.top());
        s.pop();
    }
    
}

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