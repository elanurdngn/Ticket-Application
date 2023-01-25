package com.example.BiletOtomasyonu.controller;

import com.example.BiletOtomasyonu.entity.Bus;
import com.example.BiletOtomasyonu.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    BusService busService;

    @PostMapping("/save")
    public ResponseEntity<Bus> save(@RequestBody Bus bus){
        Bus savedBus = busService.saveBus(bus);
        return new ResponseEntity<Bus>(savedBus, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Bus> update(@RequestBody Bus bus){
        Bus updatedBus = busService.updateBus(bus);
        return new ResponseEntity<Bus>(updatedBus, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable(name = "id") Long busId){
        busService.deleteBusById(busId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
