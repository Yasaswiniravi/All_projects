package oops;
class Hospital {
 void displayHospital() {
     System.out.println("Welcome to the Hospital.");
 }
}
class Doctor extends Hospital {
 void displayDoctorDept() {
     System.out.println("Doctor Department:");
 }
}
class Gynac extends Doctor {
 void gynacDoctor() {
     System.out.println("- Gynac Specialist");
 }
}

class Endo extends Doctor {
 void endoDoctor() {
     System.out.println("- Endo Specialist");
 }
}

class Cardiac extends Doctor {
 void cardiacDoctor() {
     System.out.println("- Cardiac Specialist");
 }

 void cardiacOperation() {
     System.out.println("  - Operation Section");
 }

 void cardiacOPD() {
     System.out.println("  - OPD Section");
 }
}

class Nurse extends Hospital {
 void displayNurseDept() {
     System.out.println("Nursing Department");
 }
}

class Accountant extends Hospital {
 void displayAccountDept() {
     System.out.println("Accountant Department:");
 }

 void paymentsSection() {
     System.out.println("- Payments Section");
 }

 void documentationSection() {
     System.out.println("- Documentation Section");
 }
}
public class HospitalStructure {
 public static void main(String[] args) {
     System.out.println("=== Hospital Hierarchy ===");
     Gynac gynac = new Gynac();
     gynac.displayHospital();
     gynac.displayDoctorDept();
     gynac.gynacDoctor();

     Endo endo = new Endo();
     endo.endoDoctor();

     Cardiac cardiac = new Cardiac();
     cardiac.cardiacDoctor();
     cardiac.cardiacOperation();
     cardiac.cardiacOPD();

     Nurse nurse = new Nurse();
     nurse.displayNurseDept();

     Accountant accountant = new Accountant();
     accountant.displayAccountDept();
     accountant.paymentsSection();
     accountant.documentationSection();
 }
}
 
