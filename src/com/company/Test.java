package com.company;

public class Test {
    public static void test_remove(){
        Main.LinkedList s = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            s.add_last(i+1);
        }
        s.remove_by_value(3);
        for(int i = 0; i < s.getCount(); i++){
            if(s.get(i) == 3){
                System.out.println("test failed");
                break;
            }
        }
        System.out.println("remove test passed");
    }
    public static void test_Sum(){
        Main.LinkedList a = new Main.LinkedList();
        Main.LinkedList b = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            a.add_last(i+1);
            b.add_last(2*i+2);
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
    public static void test_clean(){
        Main.LinkedList c = new Main.LinkedList();
        c.add_last(1);
        c.clean();
        if(c.getCount() == 0){
            System.out.println("clean up test passed");
        }
        else System.out.println("clean up failed");
    }
    public static void test_Size(){
        Main.LinkedList s = new Main.LinkedList();
        for(int i =0; i<5; i++){
            s.add_last(1);
        }
        if(s.getCount() == 5){
            System.out.println("size test passed");
        }else System.out.println("size test failed");
    }
    public static void test_Found(){
        Main.LinkedList f = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            f.add_last(i);
        }
        for(int i = 0; i<5; i++){
            f.add_last(5-i);
        }
        Main.LinkedList d = new Main.LinkedList();
        d = f.found_list(2);
        if((d.getCount() == 2) && (d.get(0) == 2) && (d.get(1) == 2)){
            System.out.println("found test passed");
        }else System.out.println("founf test failed");
    }
    public static void test_Insert(){
        Main.LinkedList f = new Main.LinkedList();
        int n = 3;
        for(int i = 0; i < 5; i++){
            f.add_last(i);
        }
        f.insertAfter(n, 3);
        if(f.get(n+1)==3){
            System.out.println("insert test passed");
        }else System.out.println("insert test failed");
    }
    public static void test_remove_one(){
        Main.LinkedList f = new Main.LinkedList();
        for(int i = 0; i<5; i++){
            f.add_last(i+1);
        }
        int before = f.get(3);
        f.remove_first_by_key(3);
        int after = f.get(3);
        if(before != after){
            System.out.println("remove ome test passed");
        }else System.out.println("remove one test failed");
    }
}
