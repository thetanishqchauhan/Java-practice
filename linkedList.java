class Node{
    int data;       // data value
    Node next;      // reference to the next Node in Linked list
    
    // constructors
    Node(int data1, Node next1){
        this.data = data1;      // In java, this keyword is used to access the pointers of that class
        this.next = next1;      // reference to next node is stored in the next pointer
    }
    Node(int data1){
        this.data = data1;
        this.next = null;       // reference to next node is null by default
    }

}

public class linkedList {

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

    private static int lengthOfLL(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

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
    
    public static void main(String[] args) {

        int arr[] = {12, 3, 15, 1, 8, 17};

        // // Creating a new Node with the value from the array
        // Node y = new Node(arr[1]);
        // System.out.println(y);

        // converting array into a linked list
        Node head = convertToLL(arr);
        System.out.println("Head of the linked list: " + head.data);

        // Traversing a Linked List
        Node temp = head;
        System.out.println("All elements in linked list: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        // Return the length of LL
        System.out.println();
        System.out.println("Length of LL: " + lengthOfLL(head));

        // Check for an element present in LL
        System.out.println("Checking whether 5 is present in LL: " + ifPresent(head, 5));
    }
    
}