package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static class Node
    {
        int data;
        Node next;
        Node(int d)  {
            data = d;  next = null;
        }
    }
    public static class LinkedList
    {
        Node head;
        Node tail;

        public void add_first(int new_data)         //функция добавляет в конец списка
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        public void add_last(int new_data){         //функция добавляет в конец списка
            if(head == null){
                add_first(new_data);
            }
            else{
                Node tmp = head;
                while(tmp.next!= null){
                    tmp = tmp.next;
                }
                tmp.next = new Node(new_data);
            }
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
            while(temp.next != null){
                if(temp.next.data == v){
                    Node t = temp.next;
                    temp.next = t.next;
                }else{
                    temp = temp.next;
                }
            }
        }
        public static void main(String[] args) {
            LinkedList llist = new LinkedList();
            llist.add_last(1);
            llist.add_last(3);
            llist.add_last(1);
            llist.add_last(2);
            llist.add_last(1);
            llist.value();
            llist.add_last(4);
            System.out.println();
            //llist.remove_by_value(3);
            //System.out.println();
            llist.value();
        }
    }
}
