package com.salonappbackend.Salon.App.Backend.Project.repository;

import com.salonappbackend.Salon.App.Backend.Project.model.Barber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends MongoRepository<Barber, String> {
}
