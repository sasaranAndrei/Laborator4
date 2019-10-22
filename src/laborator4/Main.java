package laborator4;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// v = d / t => d = v * t
public class Main {
	static final double sTOh = Math.pow(3600,-1); // 1 sec = 1 / 3600 hours (constanta folositoare)

	public static void simulation(Vehicle vehicle1){
		double totalKm = 0;
		vehicle1.setCurrentSpeed(0); // initial sta pe loc

		vehicle1.changeGear(1);
		vehicle1.accelerate(20); // dupa aprox 2 secunde
		totalKm += vehicle1.getCurrentSpeed() * sTOh * 2;

		vehicle1.changeGear(2);
		vehicle1.accelerate(20); // dupa aprox 3 secunde
		totalKm += vehicle1.getCurrentSpeed() * sTOh * 3;

		vehicle1.changeGear(3);
		vehicle1.accelerate(15); // dupa aprox 3 secunde
		totalKm += vehicle1.getCurrentSpeed() * sTOh * 3;

		vehicle1.changeGear(2);
		vehicle1.decelerate(25); // dupa aprox 1 secunda
		totalKm += vehicle1.getCurrentSpeed() * sTOh * 1;

		vehicle1.stop(); // franarea dureaza aprox 2 secunde
		System.out.println("The car traveled " + totalKm + " km in 10 seconds");

	}

	public static void main (String[] args) {

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setBrand("Ferrari");
		vehicle1.setMaximumSpeed(349);
		Vehicle vehicle2 = new Vehicle("Opel",new Color (255,0,0));
		vehicle2.setMaximumSpeed(349);
		//simulation(vehicle1); // simulare pentru vehicul
		Driver drivers[] = new Driver[4];
		drivers[0] = new Driver ("Pop","Marcel",19,1234);
		drivers[1] = new Driver ("Popa","Marcela",43,5678);
		drivers[2] = new Driver ("Popescu","Marcus",66,9876);
		drivers[3] = new Driver ("Pope","Marinaru",74,2345);
		// Sa presupunem ca la 20, 30, 40, ..., 80 de ani trebuie sa ti faci un control medical
		//Driver.nextMedicalInfo(drivers);
		Crosswalk crossUnirii = new Crosswalk("Unirii",false);
		// dupa ce Marcel si-a facut controlul medical, a vrut sa iasa prin oras cu masina lui Opel
		vehicle2.setDriver(drivers[0]);
		// acesta a ajuns pe Unirii cand dintr-odata a zarit un pieton pe trecere
		crossUnirii.setState(true); // fapt ce l a obligat sa opreasca ca sa poata trece fiecare pe rand
		vehicle2.stop();
		// dupa care a pornit din nou la drum pentru a il lua si pe Marcus cu el
		vehicle2.changeGear(1);
		vehicle2.accelerate(20);
		vehicle2.changeGear(2);
		vehicle2.accelerate(20);
		Parking parkUnirii = new Parking(24,"Unirii");
		// iar cand a ajuns in parcare la Unirii a ramas acolo
		parkUnirii.newVehicle(vehicle2);







	}
}

// pt constante public static final
