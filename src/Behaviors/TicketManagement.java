package Behaviors;
import Entities.Ticket;
import java.util.ArrayList;
public class TicketManagement {
    ArrayList<Ticket> ticketManagement = new ArrayList();
    public void add(Ticket ticket){
        ticketManagement.add(ticket);
    }
    public void show(){
        for (Ticket ticket: ticketManagement) {
            System.out.println(ticket.toString());
        }
    }
}
