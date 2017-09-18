import javax.swing.*;

/**
 * Created by jc260799 on 18/09/17.
 */
public class Horse {
    protected String horseName;
    protected String horseColor;
    protected int horseBirthYear;

    public void Horse(String name, String color, int birthYear){
        horseName = name;
        horseColor = color;
        horseBirthYear = birthYear;
    }

    public void getHorse(){
        JOptionPane.showMessageDialog(null,"The horse's name is " + horseName +
                " and has " + horseColor + " fur.\n The Horse was born in " +
                horseBirthYear);
    }
}
