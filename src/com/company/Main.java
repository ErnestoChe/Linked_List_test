package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n1 = new Node(23);
        Node n2 = new Node(43);
        list.add_in_tail(n1);
        list.add_in_tail(n2);
        list.add_in_tail(new Node(31));
        Node my_node = list.find(10);
    }
    class Node{
        int value;
        Node next;
        Node(int d){
            value = d;
            next = null;
        }

    }
    class LinkedList{
        Node head = null;
        Node tail = null;

        public void add_in_tail(Node item){
            if(head==null){
                head = item;
            }
            else tail.next = item;
            tail = item;
        }
        public Node find(int v){
            Node item = head;
            while(item != null){
                //item = item.next;
                if(item.value == v){
                    return item;
                }
                item = item.next;
            }
            return null;
        }
    }
}
