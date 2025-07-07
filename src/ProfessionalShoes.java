/**
 * ProfessionalShoes implements Shoes in order to override Wear from the Shoes interface
 *  this is overwritten to output a message about the Shoes
 */
public class ProfessionalShoes implements Shoes{
    @Override
    public void wear() {
        System.out.println("Wearing professional shoes");
    }
}
