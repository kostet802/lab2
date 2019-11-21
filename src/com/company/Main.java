package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Phone> phone = new ArrayList<>();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        System.out.println("Enter num " + "\n");
        String num = sc.nextLine();


        System.out.println("Enter num1 " + "\n");
        String num1 = sc.nextLine();


        System.out.println("Enter fio " + "\n");
        String fio = sc.nextLine();


        System.out.println("Enter fio1 " + "\n");
        String fio1 = sc.nextLine();

        System.out.println("Enter adres " + "\n");
        String adr = sc.nextLine();

        System.out.println("Enter adres1 " + "\n");
        String adr1 = sc.nextLine();
        phone.add(phone1);
        phone.add(phone2);

        phone1.setNumber(num);
        phone1.setFio(fio);
        phone1.setAdres(adr);

        phone2.setNumber(num1);
        phone2.setFio(fio1);
        phone2.setAdres(adr1);

       /* System.out.println("Массив содержит этот проверяемый объект: " + phone.contains(phone1));//проверка содержит ли ArrayList конкретный обьект

        int phoneIndex = phone.indexOf(phone2);
        System.out.println("Индекс искомого объекта: " + phoneIndex);

        Phone phone3 = phone.get(1);
        System.out.println("Перенос объекта: "+"\n"+ phone3.toString());

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());

        phone.clear();//очистка массива*/

        boolean check = true;//Поиск по номеру
        String check1;
        do {
            System.out.println("Enter number");//свдения по ноеру телефона
            String vvod = sc.nextLine();
            if (phone1.getNumber(num).matches(vvod)) {
                System.out.println(phone1.toString());
            } else if (phone2.getNumber(num1).matches(vvod)) {
                System.out.println(phone2.toString());
            } else {
                System.out.println("Номер свободен");//свободные номера
            }
            System.out.println("Check another?");
            check1 = sc.nextLine();
            if (check1.matches("y")) {
                check = true;
            } else {
                check = false;
            }
        } while (check == true);


        boolean check_1 = true;//Поиск по фамилии
        String check1_1;
        do {
            System.out.println("Enter fio");
            String vvod_1 = sc.nextLine();
            if (phone1.getFio(fio).matches(vvod_1)) {
                System.out.println(phone1.getNumber(num));
            } else if (phone2.getNumber(fio1).matches(vvod_1)) {
                System.out.println(phone2.getNumber(num1));
            } else {
                System.out.println("Абонента нет");
            }
            System.out.println("Check another? 'y/n?' ");
            check1_1 = sc.nextLine();
            if (check1_1.matches("y")) {
                check_1 = true;
            } else {
                check_1 = false;
            }
        } while (check_1 == true);

        System.out.println("Введите номер который хотите присвоить другому абоненту: ");//изменение номера
        String anotherNum = sc.nextLine();
        System.out.println("Введите id абонента: ");
        String idAbon = sc.nextLine();
        if(idAbon.matches("1")){
            phone1.setNumber(anotherNum);
            System.out.println(phone1.toString());
        }
        else if(idAbon.matches("2")){
            phone2.setNumber(anotherNum);
            System.out.println(phone2.toString());
        }
        else {
            System.out.println("Абонента нет");
        }


}
}


