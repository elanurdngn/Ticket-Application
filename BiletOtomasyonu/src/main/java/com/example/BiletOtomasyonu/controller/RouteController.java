package com.example.BiletOtomasyonu.controller;

import com.example.BiletOtomasyonu.entity.Route;
import com.example.BiletOtomasyonu.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/route")
public class RouteController {
    @Autowired
    RouteService routeService;

    @PostMapping("/save")
    public ResponseEntity<Route> saveRoute(@RequestBody Route route){
        Route savedRoute = routeService.saveRoute(route);
        return new ResponseEntity<Route>(savedRoute, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Route> updateRouteById(@RequestBody Route route){
        Route updatedRoute = routeService.updateRoute(route);
        return new ResponseEntity<Route>(updatedRoute, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{routeId}")
    public ResponseEntity<Void> deleteRouteById(@PathVariable(name = "routeId") Long routeId){
        routeService.deleteRouteById(routeId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
