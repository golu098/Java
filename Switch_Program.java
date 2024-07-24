// public class Switch_Program {

//     public int defineLevel(String role) {
//         var result = switch (role) {
//             case "guest" -> 0;
//             case "client" -> 1;
//             case "moderator" -> 2;
//             case "admin" -> 3;
//             default  -> {
//                 System.out.println("non-authentic role = " + role);
//                 yield -1;
//             }
//         };
//         return result;
//     }

//     public static void main(String[] args) {
//         Switch_Program sp = new Switch_Program();
        
//         // Test cases
//         String[] roles = {"guest", "client", "moderator", "admin", "unknown"};
//         for (String role : roles) {
//             int level = sp.defineLevel(role);
//             System.out.println("Role: " + role + ", Level: " + level);
//         }
//     }
// }


/**
 * Switch_Program
 */
public class Switch_Program {
public static void main(String[] args) {
    String day = new String("SAT"); 
switch (day) { 
    case "MON": 
    case "TUE": 
    case "WED": 
    case "THU": System.out.println("Time to work");  
            break; 
    case "FRI": System.out.println("Nearing weekend");  
            break; 
    case "SAT": break;
    case "SUN": System.out.println("Weekend!");  
            break; 
    default: System.out.println("Invalid day?"); 
}

}
    
}