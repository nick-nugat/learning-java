public class PatientDriverApp {
    public static void main(String[] args){
        Patient sampPatient = new Patient("Nicholas", "Hoang", "Nguyen", "123 Sample Street", "Germantown", "Maryland","20874", "John Green", "301-532-6273");
        
        //procedures
        Procedure procedure1 = new Procedure();
        Procedure procedure2 = new Procedure("Physical Exam", "2023-09-11");
        Procedure procedure3 = new Procedure("X-ray", "2023-09-11", "Dr. Nguyen", 500);



        System.out.println(displayPatient(sampPatient));
        System.out.println(displayProcedure(procedure1));
        System.out.println(displayProcedure(procedure2));
        System.out.println(displayProcedure(procedure3));

        System.out.println("Total charges: " + calculateTotalCharges(procedure1, procedure2, procedure3) + "");

        System.out.println("\nStudent Name: Nicholas Nguyen");
        System.out.println("MC#: M21131538");
        System.out.println("Due Date: <unknown rn>");



    }

    public static String displayPatient(Patient pat) { return pat.toString(); }
    public static String displayProcedure(Procedure pro) { return pro.toString(); }

    public static int calculateTotalCharges(Procedure pro1, Procedure pro2, Procedure pro3) {
       return pro1.getCharges() + pro2.getCharges() + pro3.getCharges();
   }
}
