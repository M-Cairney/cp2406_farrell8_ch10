import javax.swing.*;

/**
 * Created by jc260799 on 18/09/17.
 */
public class DemoHorses {

    public static void main(String[] args)
    {
        String name, inStr, color;
        int birthYear, races;
        name = JOptionPane.showInputDialog(null,
                "Enter the name of the horse:");
        color = JOptionPane.showInputDialog(null,
                "Enter the Color of the horse:");
        inStr = JOptionPane.showInputDialog(null,
                "Enter the Birth year of the horse:");
        birthYear = Integer.parseInt(inStr);
        inStr = JOptionPane.showInputDialog(null,
                "Enter the number of races the horse has been in:");
        races = Integer.parseInt(inStr);
        RaceHorse horse1 = new RaceHorse();
        horse1.FixRaceHorse(name, color, birthYear, races);
        horse1.display();
    }
}
