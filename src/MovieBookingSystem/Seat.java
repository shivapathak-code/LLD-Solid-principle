package MovieBookingSystem;

public class Seat {
    private int seatId;
    private SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(int seatId, SeatType seatType, SeatStatus seatStatus) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
    }
    public boolean isAvailable()
    {
        return this.seatStatus == SeatStatus.AVAILABLE;
    }
    public int getSeatId()
    {
        return seatId;
    }
    public void book()
    {
        this.seatStatus = SeatStatus.BOOKED;
    }
}
