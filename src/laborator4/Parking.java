package laborator4;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    public Integer free = 100;
    public String name;
    public Vehicle[] vehicles;

    public void newVehicle (Vehicle vehicle){
        if (this.free > 0) {
            this.free--;
            List<Vehicle> vehicles = new ArrayList<Vehicle>();
            vehicles.add(vehicle);

        }
            else{
            System.out.println("Nu mai sunt locuri libere");
        }
    }

    public Parking(Integer free, String name) {
        this.free = free;
        this.name = name;
    }

    public Integer getFree() {
        return free;
    }

    public String getName() {
        return name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }


}
