package com.smoothhunger.donate.services;


import com.smoothhunger.donate.models.Produce;
import com.smoothhunger.donate.repositories.ProduceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduceService {
    private ProduceRepository produceRepository;

    @Autowired
    public ProduceService(ProduceRepository produceRepository){this.produceRepository =produceRepository;}

    public Produce save(Produce produceToPersist) {
        return produceRepository.save(produceToPersist);
    }

    public long count() {
        return produceRepository.count();
    }
}
