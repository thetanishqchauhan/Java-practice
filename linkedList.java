class Node{
    int data;       // data value
    Node next;      // reference to the next Node in Linked list
    
    // constructors
    Node(int data1, Node next1){
        this.data = data1;      // In java, this keyword is used to access the variables of that class
        this.next = next1;      // reference to next node is stored in the next variable
    }
    Node(int data1){
        this.data = data1;
        this.next = null;       // reference to next node is null by default
    }

}

public class linkedList {

    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 1};
        // Creating a new Node with the value from the array
        Node y = new Node(arr[1]);
        System.out.println(y);

    }
    
}