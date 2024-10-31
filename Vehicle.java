public abstract class Vehicle {
 // data members (instance variables)

 private String  make;
 private String model;
 private int  year;
 private String color;
 private double price;

// constructor with parameters
public Vehicle (String  amake , String amodel , int ayear, String acolor, double aprice){

 this.make = amake;
 this.model = amodel;
 this.year = ayear;
 this.color= acolor;
 this.price = aprice;


}
// return Make 
public String getmake(){

    return this.make;
}
// return Model
public String getmodel (){
    return this.model;
}
// return year
public int getyear(){

    return this.year;
}
// return Colors
public String getcolor(){
    return this.color;
}
// return Price 
public double getprice(){
return this.price;
}

@Override
public String toString(){
return String.format ( " %s  %s  %d  %s %.2f ", getmake(),getmodel(),getyear(),getcolor(),getprice());
    }
 


}





