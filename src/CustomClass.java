public class CustomClass {
   // Minimum 3 private instance variables
    public class car {
    private String name;
    private String type;
    private double price;

    // Create an empty constructor
    public car() {
    }
    //Create a constructor that uses only 2 of 3 variables
    public car(String name, String type){
        this.name = name;
        this.type = type;
    }
    //Create a constructor that uses all 3 instance variables
    public car(String name, String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
    //Get Methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
    
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(){

    }
    public boolean isNew(){
        return true;
    }
    public String NewCar(){
        return "Holy crap I need a new car!";
    }
   
    
} 
    


