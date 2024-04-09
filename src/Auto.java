public class Auto {
    private String marke;
    private String modell;
    private int baujahr;



    public Auto(){

    } // Standard constructor

    public Auto(String marke,String modell, int baujahr ){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    } // overloaded constructor


    public void printdetails(){
        System.out.println("Baujahr: " +this.baujahr +" Modell: "+ this.modell +" Marke: "+ this.marke);
    } // Print details function
}
