package ru.gb.hw;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DisplayBoard {
    private final TicketNumberGenerator ticketNumberGenerator;

    public DisplayBoard(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        String ticketNumber = ticketNumberGenerator.createNewNumber();
        LocalDateTime createdAt = LocalDateTime.now();
        return new Ticket(ticketNumber, createdAt);
    }
}
