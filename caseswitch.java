public class caseswitch {
    public static void main(String[] args) {
        String day = "sun";
        
        switch (day) {
            case "mon":
                System.out.println("it is monday");
                break;
            case "tue":
                System.out.println("it is tuesday");
                break;  
            case "sun":  
            System.out.println("it is sunday");  

            default:
                System.out.println("invalid day");
                break;
        }
    }
    
}
