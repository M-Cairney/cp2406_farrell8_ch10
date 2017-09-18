import javax.swing.*;

/**
 * Created by jc260799 on 18/09/17.
 */
public class RaceHorse extends Horse {

    private int horseRaces;

    public void FixRaceHorse(String name, String color, int birthYear, int races){
        super.horseName = name;
        super.horseColor = color;
        super.horseBirthYear = birthYear;
        horseRaces = races;
    }

    public void display(){
        JOptionPane.showMessageDialog(null,"The horse's name is " + horseName +
                " and has " + horseColor + " fur.\n The Horse was born in " +
                horseBirthYear + ". \n The Horse has run " + horseRaces + " races.");
    }
}
