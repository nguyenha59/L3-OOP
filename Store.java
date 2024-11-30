package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
    public ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore.add(dvd);
        System.out.println("The DVD " + dvd.getTitle() + "has been added.");
    }

    public void removeDVD(DigitalVideoDisc dvd){
        if(itemsInStore.remove(dvd)){
            System.out.println("The DVD " + dvd.toString()+" has been removed.");
        }
        else{
            System.out.println("DVD " + dvd.getTitle() + "not in store" );
        }
    }

    public void printStorelist(){
        System.out.println("\n--- Store ---\n");
        try {
            for(DigitalVideoDisc dvd : itemsInStore){
                System.out.println(dvd.toString() );
            }
        } catch (Exception e) {
        }
        System.out.println("-------------");
    }

}
