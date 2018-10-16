package com.company;

public class Test {
    public static void testRemove(){
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
        System.out.println("remove test inizialization passed");
        s.removeByValue(3);
        for(int i = 0; i < s.getCount(); i++){
            if(s.get(i) == 3){
                System.out.println("test failed");
                break;
            }
        }
        System.out.println("remove test passed");
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
    }
    public static void testClean(){
        Main.LinkedList c = new Main.LinkedList();
        c.addLast(1);
        c.clean();
        if(c.getCount() == 0){
            System.out.println("clean up test passed");
        }
        else System.out.println("clean up failed");
    }
    public static void testSize(){
        Main.LinkedList s = new Main.LinkedList();
        for(int i =0; i<5; i++){
            s.addLast(1);
        }
        if(s.getCount() == 5){
            System.out.println("size test passed");
        }else System.out.println("size test failed");
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
    }
    public static void testInsert(){
        Main.LinkedList f = new Main.LinkedList();
        int n = 3;
        for(int i = 0; i < 5; i++){
            f.addLast(i);
        }
        f.insertAfter(n, 3);
        if(f.get(n+1)==3){
            System.out.println("insert test passed");
        }else System.out.println("insert test failed");
    }
    public static void testRemoveOne(){
        Main.LinkedList f = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            f.addLast(i+1);
        }
        int before = f.get(3);
        f.removeFirstByKey(3);
        int after = f.get(3);
        if(before != after){
            System.out.println("remove ome test passed");
        }else System.out.println("remove one test failed");
    }
}
