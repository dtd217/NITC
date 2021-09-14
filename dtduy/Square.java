package dtduy;

import java.util.Scanner;

class Square{
    int a;
    public void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh: ");
        a = sc.nextInt();
    }
    public void display(){
        System.out.println("Area = " + (a*a));
        System.out.println("Perimeter = " + (4*a));
    }
}