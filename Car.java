public class Car extends Vehicle implements Rentable {

    private String bodyType;
    private int mileage;


    public Car  (String  amake , String amodel , int ayear, String acolor, double aprice , String  abodyType , int amileage) {

        super (amake, amodel, ayear , acolor ,  aprice);

        this.bodyType = abodyType;
        this.mileage =  amileage;

    }

    public String getbodyType(){

        return this.bodyType;

    }

    public int getmileage (){

        return this.mileage;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %.2f", getmake(), getmodel(), getyear(), getcolor(), getprice(),getbodyType(),getmileage());
    }
    

    @Override
    public  void rent (){
      System.out.println (super.toString() + " Car  rented  " + this);

    }

    @Override

    public void returnVehicle (){

      System.out.println (super.toString() + " Car returned  " + this );
    }

    
    }



 


