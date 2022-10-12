package com.Ciclo3.reto_3.Repository;

import com.Ciclo3.reto_3.Models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCRUDRepository extends CrudRepository<Message, Integer> {
}
