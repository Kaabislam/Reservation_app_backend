package com.kaab.Reservation.app.backend.service;

import com.kaab.Reservation.app.backend.entity.Reservation;
import com.kaab.Reservation.app.backend.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow();
        reservation.setName(reservationDetails.getName());
        reservation.setEmail(reservationDetails.getEmail());
        reservation.setPhone(reservationDetails.getPhone());
        reservation.setDate(reservationDetails.getDate());
        reservation.setTime(reservationDetails.getTime());
        reservation.setGuests(reservationDetails.getGuests());
        reservation.setRequests(reservationDetails.getRequests());
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
