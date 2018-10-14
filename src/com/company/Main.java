package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static class Node
    {
        int data;
        Node next;
        Node(int d, Node next)  {
            data = d;  next = null;
        }
    }
    public static class LinkedList
    {
        Node head;
        Node tail;

        public void add_first(int new_data)         //функция добавляет в конец списка
        {
            Node new_node = new Node(new_data, head);
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
                tmp.next = new Node(new_data, null);
            }
        }

        public int getCount(){
            Node temp = head;
            int count = 0;
            while (temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public void log(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
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

        public void insertAfter(int k, int ins){
            Node tmp = head;
            while((tmp != null) && (tmp.data != k)){
                tmp = tmp.next;
            }
            if(tmp != null){
                tmp.next = new Node(ins, tmp.next);
            }
        }

        public int get(int q){
            Node tmp = head;
            int count = 0;
            while(count<q){
                tmp = tmp.next;
                count++;
            }
            return tmp.data;
        }

        public LinkedList sum(LinkedList a, LinkedList b){          //возвращает сумму двух
            LinkedList s = new LinkedList();
            if(a.getCount()==b.getCount()){
                    for(int i =0; i<a.getCount(); i++){
                        s.add_last(a.get(i)+b.get(i));
                    }
                }
                else {System.out.println("Длины списков не равны");}
                return s;
        }

        public static void main(String[] args) {
            LinkedList llist = new LinkedList();
            llist.add_last(1);
            llist.add_last(3);
            llist.add_last(1);
            llist.add_last(2);
            llist.add_last(1);
            llist.log();
            llist.add_last(4);
            llist.log();
            LinkedList klist = new LinkedList();
            for(int i = 0; i<6; i++){
                klist.add_last(i);
            }
            klist.log();
            LinkedList s = new LinkedList();
            s = s.sum(llist, klist);
            s.log();

            llist.remove_by_value(1);
            llist.log();
        }
    }
}
