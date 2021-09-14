package dtduy1;

import java.util.Scanner;
import java.util.ArrayList;

public class Rhombus{
    private ArrayList<Canh> lsCanh;
    public Rhombus(){
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
        lsCanh.add(new Canh(temp1, temp2, temp3, temp4));
        System.out.println("Nhập đường chéo AC: ");
        System.out.print("x1 = ");
        temp1 = sc.nextInt();
        System.out.print("y1 = ");
        temp2 = sc.nextInt();
        System.out.print("x3 = ");
        temp3 = sc.nextInt();
        System.out.print("y3 = ");
        temp4 = sc.nextInt();
        lsCanh.add(new Canh(temp1, temp2, temp3, temp4));
        System.out.println("Nhập đường chéo BD: ");
        System.out.print("x2 = ");
        temp1 = sc.nextInt();
        System.out.print("y2 = ");
        temp2 = sc.nextInt();
        System.out.print("x4 = ");
        temp3 = sc.nextInt();
        System.out.print("y4 = ");
        temp4 = sc.nextInt();
        lsCanh.add(new Canh(temp1, temp2, temp3, temp4));
    }
    public double Dientich(){
        double n = lsCanh.get(1).length();
        double m = lsCanh.get(2).length();
        return m*n;
    }
    public double Chuvi() {
    	double n = lsCanh.get(0).length(); 
        return 4*n;
    }
}