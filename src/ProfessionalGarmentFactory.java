/**
 * ProfessionalGarmentFactory is a class that implements the interface GarmentFactory
 * The overrides then override createTop, createPants, createShoes to create a professional outfit
 */
public class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {return new ProfessionalTop();}
    @Override
    public Pants createPants() {return new ProfessionalPants();}
    @Override
    public Shoes createShoes() {return new ProfessionalShoes();}
}
