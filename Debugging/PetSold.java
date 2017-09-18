import javax.swing.*;

/**
 * Created by jc260799 on 18/09/17.
 */
public class PetSold extends ItemSold {

    private boolean petVaccinated;
    private boolean petNeutered;
    private boolean petHousebroken;

    public void fixPetSold(String description, int price, int invoiceNumber, boolean vaccinated,
                        boolean neutered, boolean housebroken) {
        super.itemDescription = description;
        super.itemPrice = price;
        super.itemsInvoiceNumber = invoiceNumber;
        petVaccinated = vaccinated;
        petNeutered = neutered;
        petHousebroken = housebroken;
    }

    public void getPetSold() {
        JOptionPane.showMessageDialog(null, "The Invoice number for this transaction is " + itemsInvoiceNumber +
                ".\nThe item is described as " + itemDescription + ".\nThe price for this is " +
                itemPrice + "\nPet Vaccinated : " + petVaccinated + "\nPet Neutered : " + petNeutered + "\nPet House Broken : " + petHousebroken);
    }
}
