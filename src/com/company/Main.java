package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList<Integer> int_list = new LinkedList<>();
        Random rnd = new Random();
        for(int i = 0; i<int_list.size(); i++){
            int v = rnd.nextInt(20);
            int_list.add(i, v);
        }
        System.out.println(int_list);
        int_list.remove(2);
        System.out.println("size "+int_list.size());
        for(int i = 1; i<int_list.size(); i++){
            if(int_list.get(i) == 10){
                int_list.remove(i);
            }
        }
        System.out.println(int_list);
        int_list.remove(4);
    }

}
