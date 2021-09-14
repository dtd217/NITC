package dtduy1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area, Perimeter");
        System.out.println("2. Students");
        System.out.print("Nhập 1 số: ");
	    int n = sc.nextInt();
	    if (n==1){
	        System.out.println("---------------------");
	        System.out.println("1. Square");
	        System.out.println("2. Rectangular");
	        System.out.println("3. Triangle");
	        System.out.println("4. Parallelogram");
	        System.out.println("5. Rhombus");
	        System.out.print("Nhập 1 số: ");
	        int e = sc.nextInt();
		    if (e==1){
		        Square HV = new Square();
		        System.out.println("Diện tích hình vuông ABCD = " + HV.Dientich());
		        System.out.println("Chu vi hình vuông ABCD = " + HV.Chuvi());
		    }
		    if (e==2){
		        Rectangular HCN = new Rectangular();
		        System.out.println("Diện tích hình chữ nhật ABCD = " + HCN.Dientich());
		        System.out.println("Chu vi hình chữ nhật ABCD = " + HCN.Chuvi());
		    }   
		    if (e==3){
    		    Triangle TG = new Triangle();
    		    System.out.println("Diện tích tám giác ABC = " + TG.Dientich());
		        System.out.println("Chu vi tam giác ABC = " + TG.Chuvi());
		    }
		    if (e==4){
    		    Parallelogram HBH = new Parallelogram();
    		    System.out.println("Diện tích hình bình hành ABCD = " + HBH.Dientich());
		        System.out.println("Chu vi hình bình hành ABCD = " + HBH.Chuvi());
		    }
		    if (e==5){
    		    Rhombus HT = new Rhombus();
    		    System.out.println("Diện tích hình thoi ABCD = " + HT.Dientich());
		        System.out.println("Chu vi hình thoi ABCD = " + HT.Chuvi());
		    }
	    }
	    if (n==2){
	    	ArrayList<Students> s = new ArrayList<>();
	    	System.out.println("Nhập số học sinh ");
			int q;
			Students stu;
			q=sc.nextInt();
	        for (int i=0;i<q;i++) {
	        	System.out.println("Nhập thông tin học sinh "+(i+1)+": ");
	        	stu = new Students();
				stu.getInfo();
				s.add(stu);       		        	
	        }
	        for (int i=0;i<q;i++) {
	        	System.out.println("Thông tin học sinh thứ " +(i+1)+ ": ");
				s.get(i).display();
	        }
	    }
    }
}