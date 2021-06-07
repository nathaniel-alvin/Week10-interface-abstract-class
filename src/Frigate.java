public class Frigate implements SeaVessel{
    @Override
    public void launch() {
        System.out.println("Launching Frigate");
    }

    public void fireGun() {
        System.out.println("Firing gun");
    }
}
