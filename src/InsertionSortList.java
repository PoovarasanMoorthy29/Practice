package src;

import java.util.LinkedList;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode left = head;
        ListNode right = head.next;
        while (left.next != null) {
            while (right != null) {
                if (left.val > right.val) {
                    int temp = left.val;
                    left.val = right.val;
                    right.val = temp;
                }
                right = right.next;
            }
            left = left.next;
            right = left.next;
        }
        return head;

    }

    public static void main(String[] args) {
        InsertionSortList obj=new InsertionSortList();
        ListNode list=new ListNode(5);
        ListNode head=list;
        ListNode temp=list;
        for(int i=0;i<4;i++){
            ListNode newNode=new ListNode(4-i);
            temp.next=newNode;
            temp=temp.next;
        }
        ListNode result=obj.insertionSortList(head);
        while(result!=null){
            if(result.next==null){
                System.out.println(result.val);
                result=result.next;
            }
            else{
                System.out.print(result.val+"->");
                result=result.next;

            }

        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
