package lab_07;

import java.util.ArrayList;
class Pharmacy {
    public int id;
    public String name;
    public int quantity;
    public double price;
    
    public Pharmacy(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class program_1_Pharmacy {
    private ArrayList<Pharmacy> pharma = new ArrayList<Pharmacy>();

    public void addElement(int id, String name, int quantity, double price){
        pharma.add(new Pharmacy(id,name,quantity,price));
    }

    public void updateElement(int id, int quantity, double price){
        for(Pharmacy p : pharma){
            if(p.id == id){
                p.quantity = quantity;
                p.price = price;
            }
        }
    }

    public void removeElement(int id) {
        for (int i = 0; i < pharma.size(); i++) {
            if (pharma.get(i).id == id) {
                pharma.remove(i);
                i--;  // ⚠️ Don't forget this if multiple items might match
            }
        }
    }


    public Pharmacy searchElement(int id){
        Pharmacy p1 = null;
        for(Pharmacy p : pharma){
            if(p.id == id) {
                p1 = p;
            }
        }
        return p1;
    }

    public void display(){
        for(Pharmacy p : pharma){
            System.out.println(p.id + " " + p.name + " " + p.quantity + " " + p.price);
        }
    }

    public static void main(String[] args) {
        program_1_Pharmacy p = new program_1_Pharmacy();

        p.addElement(10,"XYZ",45,501.35);
        p.addElement(11,"ABC",55,601.35);

        p.display();

        p.removeElement(11);
        p.display();

        System.out.println(p.searchElement(10));
    }


}
