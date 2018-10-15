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

        public void add_first(int new_data) {
            Node new_node = new Node(new_data, head);
            new_node.next = head;
            head = new_node;
        }                  //tested
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
        }                    //tested
        public int getCount(){
            Node temp = head;
            int count = 0;
            while (temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }                                 //tested
        public void log(){
            Node temp = head;
            if(head == null){
                System.out.println("empty list");
            }
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }                                     //tested
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
        }                    //tested
        public void insertAfter(int k, int ins){
            Node tmp = head;
            while((tmp != null) && (tmp.data != k)){
                tmp = tmp.next;
            }
            if(tmp != null){
                tmp.next = new Node(ins, tmp.next);
            }
        }               //tested
        public int get(int q){
            Node tmp = head;
            int count = 0;
            while(count<q){
                tmp = tmp.next;
                count++;
            }
            return tmp.data;
        }                                 //tested
        public LinkedList sum(LinkedList a, LinkedList b){          //возвращает сумму двух
            LinkedList s = new LinkedList();

            if(a.getCount()==b.getCount())
            {
                    for(int i = 0; i<a.getCount(); i++)
                    {
                        s.add_last((a.get(i)+b.get(i)));
                    }
            }
            else {System.out.println("Длины списков не равны"); }
            return s;
        }     //tested
        public LinkedList found_list(int f){            //возвращает список из найденных узлов
            LinkedList s = new LinkedList();
            Node tmp = head;
            while(tmp!=null){
                if(tmp.data == f){
                    s.add_last(f);
                }
                tmp = tmp.next;
            }
            return s;
        }                   //tested
        public void clean(){
            head = null;
        }                       //tested
        public void remove_first_by_key(int a){
            Node tmp = head;
            while(tmp.next != null){
                if(tmp.next.data == a){
                    Node t = tmp.next;
                    tmp.next = t.next;
                    break;
                }

                else{
                    tmp = tmp.next;
                }
            }
        }                //tested

        public static void main(String[] args) {
            LinkedList llist = new LinkedList();

            Test.test_remove();
            Test.test_Sum();
            Test.test_clean();
            Test.test_Size();
            Test.test_Found();
            Test.test_Insert();
            Test.test_remove_one();
        }
    }
}
