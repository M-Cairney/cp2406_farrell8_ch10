/**
 * Created by jc260799 on 18/09/17.
 */
public class DemoItemsAndPets {

    public static void main(String[] args) {
        ItemSold item1 = new ItemSold();
        item1.fixItemSold("a soft toy" , 1.50 , 1);
        ItemSold item2 = new ItemSold();
        item2.fixItemSold("a whiteboard", 50.95, 2);
        PetSold pet1 = new PetSold();
        pet1.fixPetSold("Husky", 300, 3, false, true, false);
        PetSold pet2 = new PetSold();
        pet2.fixPetSold("Border Collie", 450, 4, true, false, true);
        item1.getItemSold();
        item2.getItemSold();
        pet1.getPetSold();
        pet2.getPetSold();

    }
}
