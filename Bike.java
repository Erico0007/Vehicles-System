public class Bike extends Vehicle implements Rentable  {

    // Data Members 
    private String type ; 


    public Bike (String  amake , String amodel , int ayear, String acolor, double aprice, String atype) {

      super (amake, amodel, ayear , acolor ,  aprice);

        this.type = atype;
    }

    public  String gettype(){

        return this.type;
    }

    @Override 
    public String toString(){
     return String.format(   " %s  %s  %d  %s %.2f  %s " ,super.toString() + " The type of the bike is :  " + gettype() + "\n");
    }
      @Override
      public  void rent (){
        System.out.println (super.toString() + "  The Bike rented   " + this);

      }

      @Override

      public void returnVehicle (){

        System.out.println (super.toString() + " The bike returned  " + this );
      }

      
      }


    

