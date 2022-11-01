package Papp;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Items> nlst=new ArrayList<>();
    Items samosa= new Items("Samosa",7,1);
    Items tea= new Items("Tea",5,2);
    Items cofee= new Items("Cofee",20,3);
    Items poha= new Items("Poha",10,4);
   public void additems() {
    nlst.add(samosa);
    nlst.add(tea);
    nlst.add(cofee);
    nlst.add(poha);
   }
   public void display() {
    for(Items items:nlst){
        System.out.println(items.Id+"  " +items.Name+"  -"+items.Price);
    }
   }
    
}
