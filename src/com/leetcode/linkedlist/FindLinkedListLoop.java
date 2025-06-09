package com.leetcode.linkedlist;

public class FindLinkedListLoop {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = node.next;

        System.out.println(findLinkedListLoop(node));
    }

    public static Boolean findLinkedListLoop(Node head) {

        if (head == null)
            return false;

        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null) {

            if(fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;

        }
    return false;
    }

}
