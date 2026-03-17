// Reservation.java

package com.restaurant.model;

public class Reservation {
    private String reservationId;
    private String customerName;
    private String reservationDate;
    private int numberOfGuests;

    public Reservation(String reservationId, String customerName, String reservationDate, int numberOfGuests) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
        this.numberOfGuests = numberOfGuests;
    }

    // Getters and Setters
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}