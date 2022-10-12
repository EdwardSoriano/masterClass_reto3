package com.Ciclo3.reto_3.Repository;

import com.Ciclo3.reto_3.Models.Reservations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ReservationsCRUDRepository extends CrudRepository <Reservations,Integer>{
}
