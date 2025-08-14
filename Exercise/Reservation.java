// Create a Reservation class with a member variable, TicketID, and a 
// method, ShowTicket(). A constructor should initialize the TicketID
//  variable, and the ShowTicket() method should display itsvalue. In 
// addition, create an object of the Reservation class to call these
//  methods.

// package Exercise;

// public class Reservation {
//     String TicketID;

//     Reservation() {
//         this.TicketID = "358CSD5620250607";
//     }

//     public void ShowTicket() {
//         System.out.println(TicketID);
//     }

//     public static void main(String[] args) {
//         Reservation obj = new Reservation();
//         obj.ShowTicket();
//     }
// }


package Exercise;

public class Reservation {
    private String ticketID;

    public Reservation() {
        this.ticketID = "358CSD5620250607";
    }

    public Reservation(String ticketID) {
        this.ticketID = ticketID;
    }

    public void showTicket() {
        System.out.println("Your Ticket ID is: " + ticketID);
    }

    public static void main(String[] args) {
        Reservation obj = new Reservation();
        obj.showTicket();

        Reservation customObj = new Reservation("ABC123XYZ");
        customObj.showTicket();
    }
}