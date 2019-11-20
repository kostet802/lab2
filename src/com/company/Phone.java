package com.company;


public class Phone {

    private String number;
    private String fio;
    private String adres;

    public Phone(){

    }

   public void setNumber(String number) {
       if(number.matches("^[0-9 ]*$")){
           this.number = number;
       }
       else{
           System.out.println("Wrong number");
       }

    }
    public String getNumber(){
        return number;
    }
    public void setFio(String fio){
        if(fio.matches("^[a-zA-Z ]*$")){
            this.fio = fio;
        }
        else{
            System.out.println("Wrong fio");
        }
    }
    public String getFio(){
        return fio;
    }
    public void setAdres(String adres) {
        if(adres.matches("^[a-zA-Z0-9 ]*$")){
            this.adres = adres;
        }
        else{
            System.out.println("Wrong adres");
        }

    }
    public String getAdres(){
        return adres;
    }

}

