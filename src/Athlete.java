public class Athlete {
    public String name;
    public int age;
    public String sport;
    public float height;
    public float weight;

    public Athlete(String name, int age, String sport, float height, float weight) {
        System.out.println("\nAthlete constructor:");
        setAthlete(name, age, sport, height, weight);
        printAthlete();


    }

    public void setAthlete(String name, int age, String sport, float height, float weight) {

        this.name = name;
        this.age = age;
        this.sport = sport;
        this.height = height;
        this.weight = weight;
    }

    public void printAthlete() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nSport: " + sport + "\nHeight: " + height +" cm " + "\nWeight: " + weight + "kg");

    }

}
