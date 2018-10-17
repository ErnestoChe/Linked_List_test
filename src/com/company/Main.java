package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static class Node
    {
        int data;
        Node next;
        public Node(int d, Node next)  {
            data = d;  next = null;
        }
    }
    public static class LinkedList
    {
        Node head;
        Node tail;
        LinkedList(){
            head = null;
            tail = null;
        }
        public void addFirst(int new_data) {
            head = new Node(new_data, head);
            tail = head;
        }                  //tested
        public void addLast(int new_data){         //функция добавляет в конец списка
            if(head == null){
                addFirst(new_data);
            }
            else{
                Node tmp = new Node(new_data, null);
                tail.next = tmp;
                tail = tail.next;
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
        public void removeByValue(int v){
            if(head.data == v){ head = head.next; }
            Node temp = head;
            while(temp.next != null){
                if(temp.next.data == v){
                    Node t = temp.next;
                    temp.next = t.next;
                    if(t.next == null){
                        tail = temp;
                    }
                }else{
                    temp = temp.next;
                }
            }
        }                    //tested
        public void insertAfter(int k, int ins){
            if(tail.data == k){
                addLast(ins);
            }
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
                        s.addLast((a.get(i)+b.get(i)));
                    }
            }
            else {System.out.println("Длины списков не равны"); }
            return s;
        }     //tested
        public LinkedList foundList(int f){            //возвращает список из найденных узлов
            LinkedList s = new LinkedList();
            Node tmp = head;
            while(tmp!=null){
                if(tmp.data == f){
                    s.addLast(f);
                }
                tmp = tmp.next;
            }
            return s;
        }                   //tested
        public void clean(){ head = null; }                       //tested
        public void removeFirstByKey(int a){
            Node tmp = head;
            while(tmp.next != null){
                if(tmp.next.data == a){
                    if(head.data == a){
                        head = head.next;
                        break;
                    }
                    Node t = tmp.next;
                    tmp.next = t.next;
                    if(t.next == null){
                        tail = tmp;
                    }
                    break;
                }
                else{
                    tmp = tmp.next;
                }
            }
        }                //tested

        public static void main(String[] args) {
            LinkedList llist = new LinkedList();
            for(int i = 0; i<=10; i++){
                llist.addLast(i);
            }
            llist.removeByValue(10);
            llist.log();
            System.out.println(llist.tail.data);
            llist.removeFirstByKey(9);
            llist.log();
            System.out.println(llist.tail.data);
            Test.testRemove();
            Test.testSum();
            Test.testClean();
            Test.testSize();
            Test.testFound();
            Test.testInsert();
            Test.testRemoveOne();
            Test.testAdd();
        }
    }
}
