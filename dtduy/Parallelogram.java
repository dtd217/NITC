package dtduy;

import java.util.Scanner;

class Parallelogram{
    double a,b,h;
    public void get(){
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh 1: ");
        a = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh 2: ");
        b = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        h = sc.nextDouble();
    }
    public void display(){
        System.out.println("---------------------");
        System.out.println("Area = " + (a*a));
        System.out.println("Perimeter = " + (2*(a+b)));
    }
}
