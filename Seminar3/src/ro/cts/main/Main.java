package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args){
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("www.sitenou.com");
        System.out.println(autoritate2);
        System.out.println(autoritate);

        autoritate.reglementeaza("Dacia Logan");
        System.out.println(autoritate);

        AutoritateReglementareMasiniLazy autoritateLazy = AutoritateReglementareMasiniLazy.getInstance("AutoritateLazy", "www.autoritatelazy.com");
        System.out.println(autoritateLazy);
        autoritateLazy.reglementeaza("Tesla");
        AutoritateReglementareMasiniLazy autoritateLazy2 = AutoritateReglementareMasiniLazy.getInstance("Autoritate","altwebsite");
        System.out.println(autoritateLazy2);
    }
}
