public class Sport {
    public String name;
    public String kdofsport;
    public int hardness;
    //hardness will be form 1 to 10
    public boolean acessibility;

    public Sport( String name, String kdofsport, int hardness, boolean acessibility ){
        System.out.println("\nSport constructor:");
        setSport(name , kdofsport , hardness , acessibility);
        printSport();

    }

    public void setSport(String name , String kdofsport , int hardness , boolean acessibility){
        this.name= name;
        this.kdofsport = kdofsport;
        this.hardness = hardness;
        this.acessibility = acessibility;

    }
    public void printSport(){
        System.out.println("Name: " + name + "\nKDOFSport: " + kdofsport + "\nHardness: " + hardness + "\nAcessibility: " + acessibility);

    }
}
