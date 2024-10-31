public class Truck extends  Vehicle implements Rentable {

    private double loadCapacity;
    private  int  numberOfAxles;


    public Truck (String  amake , String amodel , int ayear, String acolor, double aprice , double aloadCapacity , int anumberOfAxles){

        super (amake, amodel, ayear , acolor ,  aprice);

  this.loadCapacity = aloadCapacity;
  this.numberOfAxles = anumberOfAxles;
    }


    public double getloadCapacity (){

        return this.loadCapacity;
    }

    public int getnumberOfAxles(){

        return this.numberOfAxles;
    }

    @Override

    public String toString(){

        return String.format(  " %s  %s  %d  %s %.2f %d  %d " ,super.toString() + " the load Capacity of this Truck is " + getloadCapacity() 
        + " the number of AXles is " +  getnumberOfAxles());
    }

    @Override
    public  void rent (){
      System.out.println (super.toString() + " The Truck rented  " + this);

    }

    @Override

    public void returnVehicle (){

      System.out.println (super.toString() + " The Truck returned  " + this );
    }


   

   
}
