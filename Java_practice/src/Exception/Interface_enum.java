package Exception;
interface Demo {
    void showType();
    void showMessage();
}

enum Day_d implements Demo {
    SUNDAY {
        public void showType() {
            System.out.println("Weekend");
        }

        public void showMessage() {
            System.out.println("it's Sunday!");
        }
    },
    MONDAY {
        public void showType() {
            System.out.println("Weekday");
        }

        public void showMessage() {
            System.out.println("its a Monday.");
        }
    },
    TUESDAY {
        public void showType() {
            System.out.println("Weekday");
        }

        public void showMessage() {
            System.out.println("it's Tuesday.");
        }
    },
    WEDNESDAY {
        public void showType() {
            System.out.println("Weekday");
        }

        public void showMessage() {
            System.out.println("its wednesday");
        }
    },
    THURSDAY {
        public void showType() {
            System.out.println("Weekday");
        }

        public void showMessage() {
            System.out.println("its thursday");
        }
    },
    FRIDAY {
        public void showType() {
            System.out.println("Weekday");
        }

        public void showMessage() {
            System.out.println("its friday");
        }
    },
    SATURDAY {
        public void showType() {
            System.out.println("Weekend");
        }

        public void showMessage() {
            System.out.println("its Saturday!");
        }
    };
}
public class Interface_enum {
    public static void main(String[] args) {
        Day_d today = Day_d.SATURDAY; 

        today.showType();     
        today.showMessage();  
    }
}

