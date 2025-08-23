package Exception;
interface Demo_1 {
    void printType();
}

enum Day_h implements Demo_1 {
    SUNDAY, MONDAY;

    public void printType() {
        if (this == SUNDAY)
            System.out.println("Weekend");
        else
            System.out.println("Weekday");
    }
}

public class enuminterface {
    public static void main(String[] args) {
        Day_h d = Day_h.SUNDAY;
        d.printType();  
    }
}

