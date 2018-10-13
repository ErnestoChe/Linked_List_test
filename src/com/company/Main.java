package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d)  {
            data = d;  next = null; prev = null;
        }
    }
    public static class LinkedList
    {
        Node head;
        public void add(int new_data)
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
        public int getCount()
        {
            Node temp = head;
            int count = 0;
            while (temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
        public void value(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        public void remove_by_value(int v){
            Node temp = head;
            while(temp != null){
                if(temp.data == v){
                    Node t = temp;
                    temp.prev = t.next;
                    temp.next = t.prev;
                }
            }
        }
        public static void main(String[] args) {
            LinkedList llist = new LinkedList();
            llist.add(1);
            llist.add(3);
            llist.add(1);
            llist.add(2);
            llist.add(1);
            llist.value();
            llist.remove_by_value(3);
        }
    }
}
