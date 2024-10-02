package com.cityzen.supercityzen.service;

import com.cityzen.supercityzen.entity.Identifier;
import com.cityzen.supercityzen.repository.IdentifierRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {
    private IdentifierRepository identifierRepository;
    public DataInitializer(IdentifierRepository identifierRepository) {
        this.identifierRepository = identifierRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();

        for (int i = 0; i < 50; i++) {


            Identifier identifier = new Identifier();
            identifier.setLogin(faker.internet().uuid());
            identifier.setUsed(false);

            identifierRepository.save(identifier);
        }
    }
}

