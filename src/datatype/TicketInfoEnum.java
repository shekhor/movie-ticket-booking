package datatype;

public class TicketInfoEnum {
    public enum BookingStatus {
        REQUESTED, PENDING, CONFIRMED, CHECKED_IN, CANCELED, ABANDONED
    }

    public enum SeatType {
        REGULAR, PREMIUM, ACCESSIBLE, SHIPPED, EMERGENCY_EXIT, OTHER
    }

    public enum AccountStatus {
        ACTIVE, BLOCKED, BANNED, COMPROMISED, ARCHIVED, UNKNOWN
    }

    public enum PaymentStatus {
        UNPAID, PENDING, COMPLETED, FILLED, DECLINED, CANCELLED, ABANDONED, SETTLING, SETTLED, REFUNDED
    }

}
