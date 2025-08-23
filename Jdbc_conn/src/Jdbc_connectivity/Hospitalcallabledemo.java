package Jdbc_connectivity;

import java.sql.*;

public class Hospitalcallabledemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; 
        String user = "root";
        String password = "Anu@123";

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            // 1 Call avg_patient_count procedure
            System.out.println(" Average Patient Count Per Day:");
            CallableStatement cstAvg = con.prepareCall("{CALL avg_patient_count()}");
            ResultSet rsAvg = cstAvg.executeQuery();

            while (rsAvg.next()) {
                int totalPatients = rsAvg.getInt("total_patients");
                int totalDays = rsAvg.getInt("total_days");
                double avgPerDay = rsAvg.getDouble("avg_per_day");

                System.out.printf("Total Patients: %d\n", totalPatients);
                System.out.printf("Total Days: %d\n", totalDays);
                System.out.printf("Average Per Day: %.2f\n\n", avgPerDay);
            }

            // Call show_same_ward_patients procedure
            System.out.println(" Patients Ordered by Ward:");
            CallableStatement cstWard = con.prepareCall("{CALL show_same_ward_patients()}");
            ResultSet rsWard = cstWard.executeQuery();

            System.out.printf("%-15s %-20s\n", "Ward Name", "Patient Name");
            System.out.println("-------------------------------------------");
            while (rsWard.next()) {
                String ward = rsWard.getString("ward_name");
                String patient = rsWard.getString("patient_name");

                System.out.printf("%-15s %-20s\n", ward, patient);
            }

            // Call sort_by_admission_simple procedure
            System.out.println("\n Patients Sorted by Admission Date:");
            CallableStatement cstSorted = con.prepareCall("{CALL sort_by_admission_simple()}");
            ResultSet rsSorted = cstSorted.executeQuery();

            System.out.printf("%-5s %-20s %-15s %-15s %-15s\n", "ID", "Name", "Ward", "Admit Date", "Discharge");
            System.out.println("----------------------------------------------------------------------");

            while (rsSorted.next()) {
                int id = rsSorted.getInt("patient_id");
                String name = rsSorted.getString("patient_name");
                String ward = rsSorted.getString("ward_name");
                Date admitDate = rsSorted.getDate("admission_date");
                Date dischargeDate = rsSorted.getDate("discharge_date");

                System.out.printf("%-5d %-20s %-15s %-15s %-15s\n",
                        id, name, ward, admitDate.toString(),
                        dischargeDate != null ? dischargeDate.toString() : "Still Admitted");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
