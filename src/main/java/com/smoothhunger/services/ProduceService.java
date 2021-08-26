package com.smoothhunger.services;

import com.smoothhunger.repositories.ProduceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduceService {
    private ProduceRepository produceRepository;

    @Autowired
    public ProduceService(ProduceRepository produceRepository){this.produceRepository =produceRepository;}

}
