class Switch{
    public static void main(String a[]){
        int n=1; //can be int or string 
        // switch(n){
        //     case 1:
        //         System.out.println("MOnday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednedsay");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Enter valid number");
        // }

        String day="Sun";
        switch(day){
            case "Sat", "Sun" -> System.out.println("6am");
            case "Mon"-> System.out.println("7am");
            default -> System.out.println("Enter valid day");
        }
    }
}