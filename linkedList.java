class Node{
    int data;       // data value
    Node next;      // reference to the next Node in Linked list
    
    // constructors
    Node(int data1, Node next1){
        this.data = data1;      // In java, 'this' keyword is used to access the pointers of that class
        this.next = next1;      // reference to next node is stored in the 'next' pointer
    }
    Node(int data1){
        this.data = data1;
        this.next = null;       // reference to next node is null by default
    }

}

public class linkedList {

    // convert array into LL
    private static Node convertToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node tail = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            tail.next = temp;
            tail = temp;
        }
        return head;
    }

    // traverse and print the complete LL
    private static void print(Node head){
        Node temp = head;
        System.out.println("All elements of LL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // find the length of LL
    private static int lengthOfLL(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    // search for a value 'val' in the LL
    private static boolean ifPresent(Node head, int val){
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // delete the head of LL
    private static Node deleteHead(Node head){
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    // delete the tail of LL
    private static Node deleteTail(Node head){
        Node temp = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // remove an element at k
    private static Node removeK(Node head, int k){
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // remove an element with its value
    private static Node removeWithValue(Node head, int val){
        if(head == null) return null;
        if (head.data == val) {
            head = head.next;
            return head;
        }
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertNewHead(Node head, int headData){
        if(head == null) return new Node(headData);
        Node temp = new Node(headData);
        temp.next = head;
        return temp;
    }

    private static Node insertNewTail(Node head, int tailData){
        if(head == null) return new Node(tailData);
        Node newTail = new Node(tailData);
        Node temp = head;
        while (temp.next != null) {
            if(temp.next == null){
                temp.next = newTail;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertNewEl(Node head, int k, int newNodeData){
        Node newNode = new Node(newNodeData);
        if(head == null) return newNode;
        if (k == 1) {
            newNode.next = head;
            return newNode;
        }
        int cnt = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                newNode.next = prev.next;
                prev.next = newNode;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    
    public static void main(String[] args) {

        int arr[] = {12, 3, 15, 1, 8, 17};

        // // Creating a new Node with the value from the array
        // Node y = new Node(arr[1]);
        // System.out.println(y);

        // converting array into a linked list
        Node head = convertToLL(arr);
        System.out.println("Head of the linked list: " + head.data);

        // Traversing a Linked List
        print(head);
        
        // Return the length of LL
        System.out.println();
        System.out.println("Length of LL: " + lengthOfLL(head));

        // // Check for an element present in LL
        // System.out.println("Checking whether 5 is present in LL: " + ifPresent(head, 5));

        // // Delete the head of the LL
        // System.out.println("Head of LL deleted");
        // head = deleteHead(head);
        // print(head);

        // // Delete the tail of LL
        // System.out.println("Tail of LL deleted");
        // Node newLL = deleteTail(head);
        // print(newLL);

        // // Delete any node k from the LL
        // System.out.println("kth node removed");
        // head = removeK(head, 2);
        // print(head);

        // Inserting a new head
        System.out.println();
        System.out.println("Inserting 5 as new head");
        head = insertNewHead(head, 5);
        print(head);

        // Delete any node depending on the value
        System.out.println();
        System.out.println("Deleting the node with val: 1");
        head = removeWithValue(head, 1);
        print(head);

        // // Insering a new tail
        // System.out.println();
        // System.out.println("Inserting 1 as new tail");
        // head = insertNewTail(head, 1);
        // print(head);

        // Inserting a new node
        System.out.println();
        System.out.println("Inserting a new node: 1 at 5th place");
        head = insertNewEl(head, 5, 10);
        print(head);
        
    }
    
}