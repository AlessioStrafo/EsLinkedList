//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> frutta = new LinkedList<>();
        frutta.add("Mela");
        frutta.add("Pera");

        for (String fruit:frutta){
            System.out.println(fruit);
        }
        System.out.println("-----------");
        frutta.addFirst("Fragola");
        for (String fruit:frutta){
            System.out.println(fruit);
        }
        System.out.println("-----------");
        frutta.addLast("Arancia");
        for (String fruit:frutta){
            System.out.println(fruit);
        }
    }
}