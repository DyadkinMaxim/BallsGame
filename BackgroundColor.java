package neuroleptic;
import java.awt.*;
public class BackgroundColor {
    static Color   c1 = new Color(255,255,255);
    static Color c2;


public static Color getColor(){
    return  c2 =  new Color(c1.getRed()-(GameCanvas.counter * 10) ,c1.getGreen()- (GameCanvas.counter * 10) ,c1.getBlue()- (GameCanvas.counter * 10) );
}
}
