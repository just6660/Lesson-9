package employeeProject.staticExample;

/*
static variables - are NOT instance variables, which apply 
to an individual object. They are CLASS-LEVEL variables that 
apply to the entire class.
static methods - abilities of the entire CLASS and not of 
an individual object / instance. These are run through the 
class itself and not an object.
*/

public class Blob {
    private String name;
    //blobCount applies to entire class, not
    //individual blobs
    private static int blobCount=0;
    
    public Blob(String n){
        name = n;
        blobCount++;
    }
    
    public String getName(){
        return name;
    }
    
    //use static method to get a static private variable
    public static int getBlobCount(){
        return blobCount;
    }
}
