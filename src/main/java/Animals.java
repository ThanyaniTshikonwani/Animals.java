public class Animals {

    private String name;

    public  Animals(){
        // This a default constructor.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public  void sounds(){
        System.out.println("Sounds...");
    }

    public void eats(){

        System.out.println(name+ " " + "eats");
    }
}
