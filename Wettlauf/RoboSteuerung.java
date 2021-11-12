import javakarol.Roboter;
import javakarol.Welt;

/**
 * Die Klasse RoboAufgabe
 */
public class RoboSteuerung
{
    // Attribute
    private Roboter robo;

    // Konstruktor
    public RoboSteuerung(Roboter robo_)
    {
        robo = robo_;
    }

    // Methoden
    // Roboter läuft bis zur Wand und denkt manchmal nach
    public void run()
    {
        while (robo.IstWand()==false)
        {
            if (Math.random() > 0.5)
            {
                robo.Schritt();
            }
            else
            {
                robo.Warten(0.3f);
            }
        }
    }

}
