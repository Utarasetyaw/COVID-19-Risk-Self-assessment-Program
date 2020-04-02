package sample;
import java.util.Scanner;

public class Main {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int hasil = 0;
        System.out.println("COVID-19 Risk Self-assessment Program");
        System.out.println("######################################################################");
        System.out.print("What is your name? ");
        String nama = input.nextLine();
        System.out.print("Are you (M)ale of (F)emale? ");
        char kelamin = input.next().charAt(0);
        System.out.print("Are you married? (Y)es or (N)o? ");
        char married = input.next().charAt(0);
        System.out.print("How old are you? ");
        int old = input.nextInt();
        System.out.println("######################################################################");
        System.out.print("1.Have you recently traveled to an area with known local spread of COVID-19? (Y)es or (N)o? ");
        String a = input.next();
        if(a.equals("Y")){
            hasil++;}
        System.out.print("Have you come into close contact (within 6 feet) with someone who has laboratory confirmed COVID – 19 diagnosis in the past 14 days? (Y)es or (N)o? ");
        String b = input.next();
            if(b.equals("Y")){
                hasil++;}
        System.out.print("Do you have a fever (greater than 100.4 F or 38.0 C) OR symptoms of lower respiratory illness such as cough, shortness of breath, difficulty breathing or sore throat? (Y)es or (N)o? ");
        String c = input.next();
                if(c.equals("Y")){
                    hasil++;}
        System.out.print("Are you a first responder, healthcare worker, or employee or attendee of a child or adult care facility? (Y)es or (N)o? ");
        String d = input.next();
        if(d.equals("Y")){
            hasil++;}





        System.out.println("######################################################################");
        System.out.println("Dear " + nama + " ("+kelamin+"/"+married+"/"+old+")");
        System.out.println("Our recommendation is: ");
        if (hasil >= 3 ){
            System.out.println("You may need COVID-19 testing ");
        }
        else if (hasil == 2){
            System.out.println("You may need COVID-19 testing OR self-quarantine at home OR your symptoms may or may not be related to COVID-19 ");
        }
        else if (hasil == 1){
            if (a.equals("y")|| b.equals("Y")){
                System.out.println("“self quarantine at home ");
            }
            if (c.equals("Y")){
                System.out.println("your symptoms may or may not be related to COVID-19 ");
            }
            if (d.equals("Y")){
                System.out.println("practice social distancing and watch for symptoms ");
            }
        }
        else{
            System.out.println("practice social distancing and watch for symptoms ");
        }
        System.out.println("Be Safe!");
        System.out.println("Thank you.");
        System.out.println("######################################################################");
    }
}
