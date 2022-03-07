public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    //Insert at the beginning of the LinkedList
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    //Insert after a particular node in the LinkedList
    public void insertAfter(Node prev_node, int new_data) {
        if(prev_node == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    //Insert at the end of the LinkedList
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if(head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
    //Delete a node from the LinkedList
    public void delete (int key) {
        Node temp = head, prev = null;
        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if(temp == null)
            return;
        prev.next = temp.next;
    }
    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node (1);
        Node second = new Node (2);
        Node third = new Node (3);
        Node fourth = new Node(4);
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.print("\nLinkedList entered initially is: ");
        ll.printList();
        ll.delete(3);
        ll.delete(2);
        ll.delete(1);
        System.out.print("\nLinkedList after removing some elements is ");
        ll.printList();
        ll.push(7);
        ll.push(1);
        ll.push(3);
        ll.push(2);
        System.out.print("\nLinkedList after pushing elements is: ");
        ll.printList();
        ll.append(5);
        System.out.print("\nLinkedList after appending an element is ");
        ll.printList();
        ll.insertAfter(ll.head.next, 8);
        System.out.print("\nLinkedList post insertion after an element is ");
        ll.printList();
    }
}
