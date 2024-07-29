package ru.gb.hw;

import java.time.LocalDateTime;

public record Ticket(String number, LocalDateTime createdAt) {
}
