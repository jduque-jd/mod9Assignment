/**
 * PartyGarmentFactory is a class that implements the interface GarmentFactory
 * The overrides then override createTop, createPants, createShoes to create a party outfit
 */
public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {return new PartyTop();}
    @Override
    public Pants createPants() {return new PartyPants();}
    @Override
    public Shoes createShoes() {return new PartyShoes();}
}
