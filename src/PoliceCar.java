public class PoliceCar implements isEmergency, LandVehicle {
    private boolean isChasing = false;
    private boolean onBreak = false;

    @Override
    public void drive() {
        System.out.println("Driving Police Car");
    }

    @Override
    public void soundSiren() {
        System.out.println("POLICE SIREN SOUNDS");
    }

    public void patrol() {
        System.out.println("Patrolling");
    }

    public boolean isChasing() {
        return isChasing;
    }

    public void setChasing(boolean chasing) {
        isChasing = chasing;
    }

    public boolean OnBreak() {
        return onBreak;
    }

    public void setOnBreak(boolean onBreak) {
        this.onBreak = onBreak;
    }

}
