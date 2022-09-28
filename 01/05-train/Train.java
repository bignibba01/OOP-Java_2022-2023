class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int nFirstClassSeats, int nSecondClassSeats, int nFirstClassReservedSeats, int nSecondClassReservedSeats) {
        this.nTotSeats = nFirstClassSeats + nSecondClassSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nFirstClassReservedSeats = nFirstClassReservedSeats;
        this.nSecondClassReservedSeats = nFirstClassReservedSeats;
    }

    void reserveFirstClassSeats(int n) {
        this.nFirstClassReservedSeats += n;
    }

    void reserveSecondClassSeats(int n) {
        this.nSecondClassReservedSeats += n;
    }

    double getTotOccupancyRatio() {
        return ((double)this.nSecondClassReservedSeats + this.nFirstClassReservedSeats) / this.nTotSeats * 100;
    }

    double getFirstClassOccupancyRatio() {
        return (double)this.nFirstClassReservedSeats / this.nFirstClassSeats * 100;
    }

    double getSecondClassOccupancyRatio() {
        return (double)this.nSecondClassReservedSeats / this.nSecondClassSeats * 100;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = this.nSecondClassReservedSeats = 0;
    }

}