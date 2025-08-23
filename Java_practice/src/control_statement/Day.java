package control_statement;
/*print weekdays if it is mon, tue, wed, thu, fri
* else print weekend*/
public class Day {
	public static void main(String[] args) {
		String day = "mon"; 

        if (day=="Sat"|| day=="Sun") {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }
	}

}
