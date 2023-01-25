package com.example.BiletOtomasyonu.service;

import com.example.BiletOtomasyonu.entity.Route;
import com.example.BiletOtomasyonu.entity.User;
import com.example.BiletOtomasyonu.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    @Autowired
    RouteRepository routeRepository;

    public Route saveRoute(Route route){
        return routeRepository.save(route);
    }

    public Route updateRoute(Route route){
        return routeRepository.save(route);
    }

    public void deleteRouteById(Long routeId){routeRepository.deleteById(routeId);
    }
}
