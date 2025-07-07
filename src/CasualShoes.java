/**
 * This class implements Shoes in order to override Wear from the Shoes interface
 * This is overwritten to output a message about the shoes
 */
public class CasualShoes implements Shoes{
    @Override
    public void wear(){
        System.out.println("Wearing casual shoes");
    }
}
