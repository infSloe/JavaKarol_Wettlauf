import javakarol.Roboter;
import javakarol.Welt;
/**
 * Die Klasse Wettlauf
 */
public class Main
{
    public static void main(String[] args)
    {

        Welt welt;
        Roboter robo1, robo2;
        welt = new Welt(10,10,6);
        robo1 = new Roboter(1,1,'S',welt);
        robo2 = new Roboter(2,1,'S',welt);

        RoboSteuerung r1 = new RoboSteuerung(robo1);
        RoboSteuerung r2 = new RoboSteuerung(robo2);

        r1.run();
        r2.run();
    }

}
