package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims{
    public static void outPut(Cart anOrder){
        for (int i=0; i<anOrder.Quatity(); i++){
            System.out.println(anOrder.getItemsOrdered()[i].toString());
        }
    }

    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "animal", "Roger Aller", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star World", "Science fiction", "G.Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "animation", "", 113, 18.8f);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc ("Yukiguni", "Story", "Kibutsu", 200, 22.00f);
//        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.addDigitalVideoDisc(dvd4, dvd1);
//        System.out.println("Total cost: "+anOrder.totalCost());
//        anOrder.removeDigitalVideoDisc(dvd4);
//        outPut(anOrder);
        anOrder.PrintCart();

    }
}
