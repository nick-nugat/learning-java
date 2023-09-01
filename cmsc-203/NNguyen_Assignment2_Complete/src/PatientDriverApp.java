public class PatientDriverApp {
    public static void main(String[] args){
        Patient sampPatient = new Patient("Nicholas", "Hoang", "Nguyen", "123 Sample Street", "Germantown", "Maryland","20874", "John Green", "301-532-6273");
        Procedure procedure1 = new Procedure();
        Procedure procedure2 = new Procedure("Nick", "2023-09-11");
        Procedure procedure3 = new Procedure("Nick", "2023-09-11", "Dr. Nguyen", "$500");

        PatientDriverApp app = new PatientDriverApp();
        System.out.println(sampPatient.toString());
        System.out.println(procedure1.toString());
        System.out.println(procedure2.toString());
        System.out.println(procedure3.toString());

        System.out.println("Total charges: " + app.calculateTotalCharges(procedure1, procedure2, procedure3));

        System.out.println("\nStudent Name: Nicholas Nguyen");
        System.out.println("MC#: M21131538");
        System.out.println("Due Date: <unknown rn>");


    }

    public Patient displayPatient(Patient pat) {
        return pat;
    }

   public Procedure displayProcedure(Procedure pro) {
       return pro;
   }

   public String calculateTotalCharges(Procedure pro1, Procedure pro2, Procedure pro3) {
       return pro1.getCharges() + pro2.getCharges() + pro3.getCharges();
   }

}
