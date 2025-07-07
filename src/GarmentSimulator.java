public class GarmentSimulator {
    /**
     * Create a driver that tests the interfaces and their overrides
     * @param args
     */
    public static void main(String[] args) {
        simulateGarment(new ProfessionalGarmentFactory());
        System.out.println("---");
        simulateGarment(new CasualGarmentFactory());
        System.out.println("---");
        simulateGarment(new PartyGarmentFactory());
    }

    /**
     * A method that puts outfits together. It takes in the GarmentFactory to pull methods from.
     * Having different factories allows the codebase to be modular and easier to update when things update/change.
     * @param factory - Input factory for casual, professional and party GarmentFactory
     */
    private static void simulateGarment(GarmentFactory factory) {
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        top.wear();
        pants.wear();
        shoes.wear();
    }
}
