public class Hovercraft implements LandVehicle, SeaVessel {
    @Override
    public void drive() {
        System.out.println("Driving Hovercraft");
    }

    @Override
    public void launch() {
        System.out.println("Launching Hovercraft");
    }

    public void enterLand() {
        System.out.println("Entering land");
    }

    public void enterSea() {
        System.out.println("Entering sea");
    }
}
