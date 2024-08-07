package com.salonappbackend.Salon.App.Backend.Project.repository;

import com.salonappbackend.Salon.App.Backend.Project.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}