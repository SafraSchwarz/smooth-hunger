package com.smoothhunger.donate.repositories;


import com.smoothhunger.donate.models.Produce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduceRepository extends CrudRepository<Produce, Integer> {
}
