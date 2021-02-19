package Entities;

public class Ticket {
    private int ticketNo;
    private Vehicle vehicle;
    private Person person;

    public Ticket(){
    }
    public Ticket(int ticketNo, Vehicle vehicle, Person person) {
        this.ticketNo = ticketNo;
        this.vehicle = vehicle;
        this.person = person;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNo=" + ticketNo +
                ", vehicle=" + vehicle +
                ", person=" + person +
                '}';
    }
}
