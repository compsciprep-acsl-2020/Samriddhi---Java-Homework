public class Student {
    private String id;
    private String name;
    private String zip;
    private String location;


    public Student(String id, String name, String zip, String location) {
        this.id = id;
        this.name = name;
        this.zip = zip;
        this.location = location;
    }

    public String toString() {
        return id + " " + name +  " " + zip +  " " + location;
    }
}



