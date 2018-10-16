package com.company;

public class Test {
    public static void testRemove(){
        System.out.println();
        Main.LinkedList s = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            s.addLast(i+1);
        }
        for(int i = 0; i<5; i++){
            if(s.get(i) != i+1){
                System.out.println("remove test inizialization failed");
                break;
            }
        }
        int h1 = s.head.data;
        int t1 = s.tail.data;
        System.out.println("remove test inizialization passed");
        s.removeByValue(3);
        int h2 = s.head.data;
        int t2 = s.tail.data;
        if((h1 == h2) && (t1 == t2)){
            System.out.println("remove test passed");
        }else System.out.println("remove test passed");
        System.out.println();
    }
    public static void testAdd(){
        Main.LinkedList a = new Main.LinkedList();
        int n = 5;
        for(int i = 0; i<n; i++){
            a.addLast(i);
        }
        if((a.head.data == 0) && (a.tail.data == 4)){
            System.out.println("add last test passed");
        }else System.out.println("add last test failed");
        System.out.println();
    }
    public static void testSum(){
        Main.LinkedList a = new Main.LinkedList();
        Main.LinkedList b = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            a.addLast(i+1);
            b.addLast(2*i+2);
        }
        Main.LinkedList summa = new Main.LinkedList();
        summa = summa.sum(a, b);
        for(int i = 0; i < 5; i++){
            if(summa.get(i) != 3*i+3){
                System.out.println("sum test failed");
                break;
            }
        }
        System.out.println("sum test passed");
        System.out.println();
    }
    public static void testClean(){
        Main.LinkedList c = new Main.LinkedList();
        c.addLast(1);
        c.clean();
        if(c.getCount() == 0){
            System.out.println("clean up test passed");
        }
        else System.out.println("clean up failed");
        System.out.println();
    }
    public static void testSize(){
        Main.LinkedList s = new Main.LinkedList();
        for(int i =0; i<5; i++){
            s.addLast(1);
        }
        if(s.getCount() == 5){
            System.out.println("size test passed");
        }else System.out.println("size test failed");
        System.out.println();
    }
    public static void testFound(){
        Main.LinkedList f = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            f.addLast(i);
        }
        for(int i = 0; i<5; i++){
            f.addLast(5-i);
        }
        Main.LinkedList d;
        d = f.foundList(2);
        if((d.getCount() == 2) && (d.get(0) == 2) && (d.get(1) == 2)){
            System.out.println("found test passed");
        }else System.out.println("found test failed");
        System.out.println();
    }
    public static void testInsert(){
        Main.LinkedList f = new Main.LinkedList();
        int n = 3;
        for(int i = 0; i < 5; i++){
            f.addLast(i);
        }
        int h1 = f.head.data;
        int t1 = f.tail.data;
        f.insertAfter(n, 3);
        int h2 = f.head.data;
        int t2 = f.tail.data;
        if((h1 == h2) && (t1 == t2)){
            System.out.println("insert test passed");
        }else System.out.println("insert test failed");
        System.out.println();
    }
    public static void testRemoveOne(){
        Main.LinkedList f = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            f.addLast(i+1);
        }
        int h1 = f.head.data;
        int t1 = f.tail.data;
        f.removeFirstByKey(3);
        int h2 = f.head.data;
        int t2 = f.tail.data;
        if((h1 == h2)&& (t1 == t2)){
            System.out.println("remove ome test passed");
        }else System.out.println("remove one test failed");
        System.out.println();
    }
}
