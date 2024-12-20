public class SportClub {

    public String name;
    public String location;
    public int num_of_sec;

    public SportClub(String name, String location, int num_of_sec) {
        System.out.println("\nSportClub constructor:");
        setSportClub(name, location, num_of_sec);
        printSportClub();
    }

    public void setSportClub(String name, String location, int num_of_sec) {
        this.name = name;
        this.location = location;
        this.num_of_sec = num_of_sec;

    }
    public void printSportClub(){
        System.out.println("Name: " + name + "\nLocation: " + location + "\nNumber of sections: " + num_of_sec);
    }

}
