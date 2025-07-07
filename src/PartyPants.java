/**
 * PartyPants implements the interface Pants in order to overwrite wear from the Pants interface
 * This is overwritten to output a message about the pants
 */
public class PartyPants implements Pants {
    @Override
    public void wear(){
        System.out.println("Wearing party pants");
    }
}
