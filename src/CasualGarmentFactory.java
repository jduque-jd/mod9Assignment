/**
 * CasualGarmentFactory is a class that implements the interface GarmentFactory
 * The overrides then override createTop, createPants, createShoes to create a casual outfit
 */
public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {return new CasualTop();}
    @Override
    public Pants createPants() {return new CasualPants(); }
    @Override
    public Shoes createShoes() {return new CasualShoes();}
}
