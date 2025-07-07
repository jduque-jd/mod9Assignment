/**
 * GarmentFactory is an interface that has three methods
 * these method are made to be overwritten in the classes that implement this interface
 */
public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
