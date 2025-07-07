/**
 * PartyTop implements Top in order to override Wear from the Top interface
 * this is overwritten to output a message about the top
 */
public class PartyTop implements Top{
    @Override
    public void wear(){
        System.out.println("Wearing a party top");
    }
}
