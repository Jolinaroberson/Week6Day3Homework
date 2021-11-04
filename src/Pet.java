// Create a Pet Class with private instance variables
public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    // Create two constructors (empty, all attributes)
    public Pet() {

    }

    public Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    //Get Methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
   
    //Set Methods
    public void setName(String name){
        this.name = name;
    } 
    public void setAge(int age){
        this.age = age;
    }
    public void setLocation(String location){

    }
}
   
       


