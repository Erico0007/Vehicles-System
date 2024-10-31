public class VehicleRentalSystem {
        

        public static void main(String[] args) {

              // Create Object Rental Service 
            RentalService rentalService = new RentalService();
    
            // Create Vehicle objects
            Car vehicle1 = new Car("Toyota", "Camry", 2020, "Red", 25000.00, "Sedan", 50000);
            Car vehicle2 = new Car("Honda", "Civic", 2019, "Blue", 22000.00, "Sedan", 500);
            Car vehicle3 = new Car("Kia", "Sorento", 2021, "Yellow", 18775.00, "SUV", 1000);
            Truck vehicle4 = new Truck("Ford", "F-150", 2018, "Black", 35000.00, 2600.5, 2);
            Truck vehicle5 = new Truck("Toyota", "Tundra", 2022, "Grey", 35000.00, 2300.5, 2);
            Truck vehicle6 = new Truck("Ram", "1500 SLT", 2023, "Brown", 29000.00, 2800.5, 2);
            Bike vehicle7 = new Bike("Trek", "Marlin 7 Gen 3", 2025, "Black", 1599, "CrossCountry");
            Bike vehicle8 = new Bike("Altitude", "A30 Shimano", 2023, "White", 4879, "RockyMountain");
            Bike vehicle9 = new Bike("Norco", "BigFoot Hydro", 2023, "Black", 2999, "CrossCountry");
    
            // Add the Vehicles to the Rental
            rentalService.addvehicle(vehicle1);
            rentalService.addvehicle(vehicle2);
            rentalService.addvehicle(vehicle3);
            rentalService.addvehicle(vehicle4);
            rentalService.addvehicle(vehicle5);
            rentalService.addvehicle(vehicle6);
            rentalService.addvehicle(vehicle7);
            rentalService.addvehicle(vehicle8);
            rentalService.addvehicle(vehicle9);

            vehicle1.rent();
            
            vehicle7.getmake();
   
    
            // List all vehicles

            rentalService.listVehicles();
    
        

        }

    }

