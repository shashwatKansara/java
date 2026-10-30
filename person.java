public class person {
    private String name;
    private int age;
    private String location;
// the process of enabling private variables to become public is known as encapsulation
// encapsulation is mainly used to avoid displaying sensitive information from a class.
    public void setName(String nName){
        this.name = nName;
    }

    public void setAge(int nAge) {
        this.age = nAge;
    }

    public void setLoc(String newLocation) {
        this.location = newLocation;
    }

    public String getName() {
        return name;
    }
    public String getLoc() {
        return location;
    }
    public int getAge() {
        return age;
    }


}
