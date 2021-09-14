package dtduy;

import java.util.Scanner;

class Triangle{
    double a,b,c,h;
    public void get(){
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh 1: ");
        a = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh 2: ");
        b = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh 3: ");
        c = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        h = sc.nextDouble();
    }
    public void display(){
        System.out.println("---------------------");
        System.out.println("Area = " + ((c*h)/2));
        System.out.println("Perimeter = " + (a+b+c));
    }
}