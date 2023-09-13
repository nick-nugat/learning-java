public class Procedure {
    //instance variables
    private String name, date, practitioner;
    int charges;

    //constructors
    public Procedure(){
        this.name = "IV";
        this.date = "2023-09-11";
        this.practitioner = "Dr. Berry";
        this.charges = 600;
    } 
    
    public Procedure(String name, String date){
        this.name = name;
        this.date = date;
        this.practitioner = "Dr. Berry";
        this.charges = 600;
    } 
    
    public Procedure(String name, String date, String practitioner, int charges){
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charges = charges;
    }
    

    //accessors
    public String getPractitioner() { return practitioner; }
    public int getCharges() { return charges; }
    public String getDate() { return date; }
    public String getName() { return name; }

    //mutators
    public void setPractitioner(String practitioner) { this.practitioner = practitioner; }
    public void setCharges(int charges) { this.charges = charges; }
    public void setDate(String date) { this.date = date; }
    public void setName(String name) { this.name = name; }

    public String toString(){
        return "Procedure: " + getName() + 
               "\nProcedure Date: " + getDate() + 
               "\nPractitioner: " + getPractitioner() + 
               "\nCharge: " + getCharges();
    }
    
}
