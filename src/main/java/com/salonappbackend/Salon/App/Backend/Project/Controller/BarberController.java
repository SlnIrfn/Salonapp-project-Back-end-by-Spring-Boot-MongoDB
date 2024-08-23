package com.salonappbackend.Salon.App.Backend.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.salonappbackend.Salon.App.Backend.Project.Services.BarberService;
import com.salonappbackend.Salon.App.Backend.Project.model.Barber;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BarberController {

    @Autowired
    private BarberService barberService;

    @PostMapping("/addbarber")
    public ResponseEntity<String> barberdata(@Valid @RequestBody Barber barber){
        barberService.detailsBarber(barber);
        return new ResponseEntity<>("Barber Details added Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/getBarber/{id}")
    public Optional<Barber> getBarber(@PathVariable String id){
        return barberService.getBarberByID(id);
    }
}
