public class Procedure {
    private String name, date, practitioner, charges;

    public Procedure(){ 
        
    }

    public Procedure(String name, String date){
        this.name = name;
        this.date = date;
    }
    public Procedure(String name, String date, String practitioner, String charges){
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charges = charges;
    }


    //accessors
    public String getPractitioner() {
        return practitioner;
    }

    public String getCharges() {
        return charges;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    //mutators
    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Procedure: " + getName() + 
               "\nProcedure Date: " + getDate() + 
               "\nPractitioner: " + getPractitioner() + 
               "\nCharge: " + getCharges();
    }
    
}
