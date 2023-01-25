package com.example.BiletOtomasyonu.service;

import com.example.BiletOtomasyonu.entity.Bus;
import com.example.BiletOtomasyonu.entity.User;
import com.example.BiletOtomasyonu.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    @Autowired
    BusRepository busRepository;

    public Bus saveBus(Bus bus){
        return busRepository.save(bus);
    }

    public Bus updateBus(Bus bus){
        return busRepository.save(bus);
    }

    public void deleteBusById(Long busId){busRepository.deleteById(busId);
    }
}
