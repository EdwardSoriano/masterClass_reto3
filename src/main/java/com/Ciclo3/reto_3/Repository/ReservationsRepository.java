package com.Ciclo3.reto_3.Repository;

import com.Ciclo3.reto_3.Models.Reservations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationsRepository {
    @Autowired
    private ReservationsCRUDRepository reservationsCrudRepository;

    public List<Reservations> getAll(){
        return (List<Reservations>) reservationsCrudRepository.findAll();
    }

    public Optional<Reservations> getReservation(int reservation_id){
        return reservationsCrudRepository.findById(reservation_id);
    }

    public Reservations save(Reservations reservation){
        return reservationsCrudRepository.save(reservation);
    }

    public void delete(Reservations reservation){
        reservationsCrudRepository.delete(reservation);
    }
}