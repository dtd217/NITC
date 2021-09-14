package dtduy;

import java.util.Scanner;

class Students{
    String name,lop;
    int age, score;
    public void get(){
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name=sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop=sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age=sc.nextInt();
        System.out.print("Nhập điểm: ");
        score=sc.nextInt();
    }
    public void display(){
        System.out.println("---------------------");
        System.out.println("Họ tên: " + name);
        System.out.println("Lớp: " + lop);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm: " + score);
    }
}