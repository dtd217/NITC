package dtduy1;

import java.util.Scanner;
import java.util.ArrayList;

public class Triangle{
    private ArrayList<Canh> lsCanh;
    public Triangle(){
        Scanner sc = new Scanner(System.in);
        lsCanh = new ArrayList<Canh>();
        int temp1, temp2, temp3, temp4;
        System.out.println("Nhập cạnh AB: ");
        System.out.print("x1 = ");
        temp1 = sc.nextInt();
        System.out.print("y1 = ");
        temp2 = sc.nextInt();
        System.out.print("x2 = ");
        temp3 = sc.nextInt();
        System.out.print("y2 = ");
        temp4 = sc.nextInt();
        lsCanh.add(new Canh(temp1, temp2, temp3,temp4));
        System.out.println("Nhập cạnh BC: ");
        System.out.print("x2 = ");
        temp1 = sc.nextInt();
        System.out.print("y2 = ");
        temp2 = sc.nextInt();
        System.out.print("x3 = ");
        temp3 = sc.nextInt();
        System.out.print("y3 = ");
        temp4 = sc.nextInt();
        lsCanh.add(new Canh(temp1, temp2, temp3,temp4));
        System.out.println("Nhập cạnh CA: ");
        System.out.print("x3 = ");
        temp1 = sc.nextInt();
        System.out.print("y3 = ");
        temp2 = sc.nextInt();
        System.out.print("x1 = ");
        temp3 = sc.nextInt();
        System.out.print("y1 = ");
        temp4 = sc.nextInt();
        lsCanh.add(new Canh(temp1, temp2, temp3,temp4));
    }
    public double Dientich(){
        double a = lsCanh.get(0).length();
        double b = lsCanh.get(1).length();
        double c = lsCanh.get(2).length();
        double p = (a+b+c)*0.5;
        double s = Math.sqrt(p*(p-a)*(p-b*(p-c)));
        return s;
    }
    public double Chuvi() {
    	double a = lsCanh.get(0).length();
        double b = lsCanh.get(1).length();
        double c = lsCanh.get(2).length();
        return a+b+c;
    }
}
