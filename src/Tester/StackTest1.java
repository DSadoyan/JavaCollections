package Tester;

public class StackTest1 {

    static  void xyz1(){
        System.out.println("xyz1 start");
        System.out.println("xyz1 end");
    }
    static void xyz2(){
        System.out.println("xyz2 start");
        xyz1();
        System.out.println("xyz2 end");
    }
    static void xyz3(){
        System.out.println("xyz3 start");
        xyz2();
        System.out.println("xyz3 end");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        xyz3();
        System.out.println("main end");
    }
}
