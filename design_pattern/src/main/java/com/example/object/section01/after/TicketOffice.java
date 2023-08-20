package com.example.object.section01.after;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private long amount;
    private List<Ticket> tickets;

    public TicketOffice(long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets = tickets;
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    //We need trade off here!
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
