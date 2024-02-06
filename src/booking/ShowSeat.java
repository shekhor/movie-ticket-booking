package booking;

public class ShowSeat extends CinemaHallSeat {

    private int showSeatId;
    private boolean isReserved;
    private double price;

    public ShowSeat(int hall_seat_id, String seat_type, int showSeatId, boolean isReserved, double price) {
        super(hall_seat_id, seat_type);
        this.showSeatId = showSeatId;
        this.isReserved = isReserved;
        this.price = price;
    }

    public int getShowSeatId() {
        return showSeatId;
    }

    public void setShowSeatId(int showSeatId) {
        this.showSeatId = showSeatId;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
