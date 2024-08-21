package com.salonappbackend.Salon.App.Backend.Project.Services;

import com.salonappbackend.Salon.App.Backend.Project.model.Barber;
import com.salonappbackend.Salon.App.Backend.Project.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarberService {

    private final BarberRepository barberRepository;

    @Autowired
    public BarberService(BarberRepository barberRepository){
        this.barberRepository = barberRepository;
    }

    public void detailsBarber(Barber barber){
        barberRepository.save(barber);
    }
}
