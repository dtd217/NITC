package dtduy;

import java.util.Scanner;

class Rhombus{
    double a,b,c;
    public void get(){
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh: ");
        a = sc.nextDouble();
        System.out.print("Nhập độ dài đường chéo 1: ");
        b = sc.nextDouble();
        System.out.print("Nhập độ dài đường chéo 2: ");
        c = sc.nextDouble();
    }
    public void display(){
        System.out.println("---------------------");
        System.out.println("Area = " + (b*c));
        System.out.println("Perimeter = " + (4*a));
    }
}
