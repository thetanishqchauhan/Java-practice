class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
    
}

public class doublyLL {

    private static Node arrToDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }

    private static Node print(Node head){
        Node temp = head;
        System.out.println("Doubly Linked List is : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return head;
    }

    private static Node removeHeadOfDLL(Node head){
        if(head == null) return head;
        if(head.next == null){
            head = head.next;
            return head;
        }
        Node prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;
        return head;
    }

    private static Node removeTailOfDLL(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newTail = temp.back;
        newTail.next = null;
        temp.back = null;
        return head;
    }

    private static Node removeKthEl(Node head, int k){
        if(head == null) return null;
        if (head.next == null) {
            if (k == 1) {
                head = head.next;
                head.back = null;
                return head;
            }
            else{
                return null;
            }
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;
        return head;
    }

    private static Node insertBeforeKthEl(Node head, int k, int nodeData){
        Node newNode = new Node(nodeData);
        if(head == null) return head;
        if (k ==  1) {
            newNode.next = head;
            newNode.back = null;
            head.back = newNode;
            return newNode;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        newNode.next = temp;
        newNode.back = prev;
        temp.back = newNode;
        prev.next = newNode;
        return head;
    }

    private static Node reverseDLL(Node head){
        if(head == null || head.next == null) return head;
        Node prev = null;
        Node current = head;
        while (current != null) {
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }
        return prev.back;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7};

        // Converting an array into Doubly Linked List
        Node head = arrToDLL(arr);
        // Print the DLL using traversing in 'print' function
        print(head);

        System.out.println();
        // // Delete the head of the DLL
        // head = removeHeadOfDLL(head);
        // print(head);

        // // Delete the tail of the DLL
        // head = removeTailOfDLL(head);
        // print(head);

        // // Delete the kth node of DLL
        // head = removeKthEl(head, 3);
        // print(head);

        // // Insert kth node in the DLL
        // head = insertBeforeKthEl(head, 4, 2);
        // print(head);

        // Reverse a DLL
        head = reverseDLL(head);
        print(head);

    }
}
