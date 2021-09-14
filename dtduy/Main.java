package dtduy;

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
		        HV.get();
		        HV.display();
		    }
		    if (e==2){
		        Rectangular HCN = new Rectangular();
		        HCN.get();
		        HCN.display();
		    }   
		    if (e==3){
    		    Triangle TG = new Triangle();
		        TG.get();
		        TG.display();
		    }
		    if (e==4){
    		    Parallelogram HBH = new Parallelogram();
		        HBH.get();
		        HBH.display();
		    }
		    if (e==5){
    		    Rhombus HT = new Rhombus();
		        HT.get();
		        HT.display();
		    }
	    }
	    if (n==2){
	        System.out.println("---------------------");
	        System.out.println("Nhập thông tin học sinh: ");
	        Students s1 = new Students();
	        s1.get();
	        s1.display();
	    }
    }
}