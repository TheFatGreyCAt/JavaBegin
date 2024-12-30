package Demo;

import java.util.Scanner;

public class HelloWorld {

    public String name, schoolName;
    public int yob;

    public static void main(String[] args){
        HelloWorld HelloWorldVer1 = new HelloWorld();
        HelloWorldVer1.input();
    }

    // bai 2
    /*
    public void input(){
        String idolName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------[Nickname maker]------\nCung cap cho may tinh thong tin ve ban...!");
        System.out.println("------Que quan cua ban: "); name = scanner.nextLine();
        System.out.println("------Ten than tuong yeu thich cua ban: "); idolName = scanner.nextLine();
        System.out.println("====> Biet danh thich hop danh cho ban: << " + (idolName + " " + name) + ">>");

        scanner.close();
    }
    */

    //bai 3

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: "); name = scanner.nextLine();
        System.out.println("Nhap truong hoc: "); schoolName = scanner.nextLine();
        System.out.println("Nhap nam sinh: "); yob = scanner.nextInt();

        System.out.println("Xin chao " + name + " ...! (^_^)");
        System.out.println( name + " nam nay " + (2025 - yob) + ", hoc sinh truong " + schoolName);
    }

}