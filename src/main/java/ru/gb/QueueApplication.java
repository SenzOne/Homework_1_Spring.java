package ru.gb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.gb.hw.DisplayBoard;
import ru.gb.hw.Ticket;

@SpringBootApplication
public class QueueApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QueueApplication.class, args);
		DisplayBoard displayBoard = context.getBean(DisplayBoard.class);

		Ticket ticket1 = displayBoard.newTicket();
		System.out.println(ticket1.number() + " created at " + ticket1.createdAt());

		Ticket ticket2 = displayBoard.newTicket();
		System.out.println(ticket2.number() + " created at " + ticket2.createdAt());

		Ticket ticket3 = displayBoard.newTicket();
		System.out.println(ticket3.number() + " created at " + ticket3.createdAt());
	}
}