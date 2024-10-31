

import java.util.ArrayList;
import java.util.List;

public class RentalService {

    // LIST TO HOLD VEHICLES

    private List<Vehicle>vehicles;
   
 // Constructor 
    public RentalService(){
         this.vehicles = new ArrayList<>();
    
    }
 // Method to remove a vehicle
    public void  addvehicle(Vehicle vehicle){
    vehicles.add(vehicle);
    }
    // Method to remove a vehicle
    public void  removevehicle (Vehicle vehicle){
           vehicles.remove(vehicle);
    }
      
    // Method to list all vehicles
    public void listVehicles(){

        for (Vehicle vh : vehicles){

            //System.out.println(vehicle);
              System.out.println (vh.getmake() + " " + vh.getmodel() + " " + vh.getyear()+" " + vh.getcolor()+ " "+vh.getprice());
        }        
    }   

    // Method to find a vehicle by make and model
    public Vehicle findVehicle(String make, String model) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getmake().equalsIgnoreCase(make) && vehicle.getmodel().equalsIgnoreCase(model)) {
                return vehicle;
            }
        }
        return null;

}
}
