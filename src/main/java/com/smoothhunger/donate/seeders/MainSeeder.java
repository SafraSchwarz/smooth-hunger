package com.smoothhunger.donate.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainSeeder implements CommandLineRunner {
    private  final ProducePluSeeder producePluSeeder;

    @Autowired
    public MainSeeder(ProducePluSeeder producePluSeeder){
        this.producePluSeeder = producePluSeeder;
    }

    @Override
    public void run(String... args) throws Exception {
        producePluSeeder.run();
    }

}
