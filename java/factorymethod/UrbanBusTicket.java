package factorymethod;

import java.util.Calendar;

public class UrbanBusTicket extends Ticket {
    public UrbanBusTicket(String origin, String destiny, Calendar dateTime) {
        super(origin, destiny, dateTime);
    }

    @Override
    public void getDetails() {
        System.out.println("Urban bus ticket: "
                + this.getOrigin() + " from " + this.getDestination()
                + " Date: " + super.dateFormat.format(this.getDateTime().getTime()));
    }
}