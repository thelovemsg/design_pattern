package com.example.object.section01.after;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    //TicketSeller can't see inside the bag.
    //Only Audience can see inside his bag.
    public void sellTo(Audience audience) {
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
        //The codes above infringes autonomy of TicketOffice.
        ticketOffice.sellTicketTo(audience);
    }
}
