package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone phone1 = new Phone();

        System.out.println("Enter num " + "\n");
        String num = sc.nextLine();

        System.out.println("Enter fio " + "\n");
        String fio = sc.nextLine();

        System.out.println("Enter adres " + "\n");
        String adr = sc.nextLine();

        phone1.setNumber(num);
        phone1.setFio(fio);
        phone1.setAdres(adr);

        System.out.println("Number " + "\n" + phone1.getNumber());
        System.out.println("Fio " + "\n" + phone1.getFio());
        System.out.println("Adres " + "\n" + phone1.getAdres());
    }
}
