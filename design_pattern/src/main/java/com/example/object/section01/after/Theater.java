package com.example.object.section01.after;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        //encapsulation well processed

        //This class 'Theater' doesn't access to the ticketOffice.
        //Theater doesn't know TicketOffice exists inside the Ticket Seller
        ticketSeller.sellTo(audience);
    }
}
