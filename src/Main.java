import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();

        var policecar = new PoliceCar();
        vehicleList.add(policecar);
        policecar.setChasing(true);
        policecar.soundSiren();

    }
}
