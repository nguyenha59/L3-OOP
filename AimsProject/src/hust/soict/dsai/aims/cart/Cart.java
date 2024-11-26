package hust.soict.dsai.aims.cart;


import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc itemsOrdered[] =new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public Cart(){

    }

    public int Quatity (){
        return qtyOrdered;
    }

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    //addDigitalVideoDisc lab02
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        }
        else {
            System.out.println("The cart is full.");
        }
    }

    //addDigitalVideoDisc lab03 2.1a)
    // public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
    //     for(DigitalVideoDisc dvd : dvdList){
    //         if (qtyOrdered < MAX_NUMBERS_ORDERED){
    //             itemsOrdered[qtyOrdered] = dvd;
    //             qtyOrdered++;
    //             System.out.println("The disc has been added.");
    //         }
    //         else{
    //             System.out.println("The cart is full.");
    //         }
    //     }
    // }

    //addDigitalVideoDisc lab03 2.1b)
    public void addDigitalVideoDisc(DigitalVideoDisc... disc){
        for(DigitalVideoDisc dvd : disc){
            if (qtyOrdered < MAX_NUMBERS_ORDERED){
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc has been added.");
            }
            else{
                System.out.println("The cart is full.");
            }
        }
    }

    //addDigitalVideoDisc lab03 2.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        }
        else{
            System.out.println("The cart is full.");
        }

        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        }
        else{
            System.out.println("The cart is full.");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc " + disc.toString()+" has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc was not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                total += itemsOrdered[i].getCost();
            }
        }
        return total;
    }

    //print the list of ordered items of a cart
    public void PrintCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");
        float cost = 0;
        for(DigitalVideoDisc disc : itemsOrdered){
            try {
                System.out.println(disc.toString());
                cost += disc.getCost();
            } catch (NullPointerException e) {
            }
        }
        System.out.println("Total cost: " + cost);
        System.out.println("***************************************************");
    }

    public void SearchById(int id){
        boolean found = false;
        try {
            for(DigitalVideoDisc disc : itemsOrdered){
                if(disc.getId() == id){
                    System.out.println("Found by id " + id + ": " + disc.toString());
                    found = true;
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
        if(!found){
            System.out.println("No DVD found with by " + id);
        }
    }

    public void SearchBytitle(String title){
        boolean found = false;
        try {
            for(DigitalVideoDisc dvd : itemsOrdered){
                if(dvd.getTitle() == title){
                    System.out.println("Found by title " + title + ": " + dvd.toString());
                    found = true;
                    break;
                }
            }
        } catch (NullPointerException e) {
        }
        if(!found){
            System.out.println("No DVD found with by " + title);
        }
    }

}
