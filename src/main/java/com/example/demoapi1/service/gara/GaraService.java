package com.example.demoapi1.service.gara;

import com.example.demoapi1.model.Gara;
import com.example.demoapi1.repo.IGaraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GaraService implements IGaraService{

    @Autowired
    private IGaraRepo garaRepo;

    @Override
    public Iterable<Gara> findAll() {
        return garaRepo.findAll();
    }

    @Override
    public Optional<Gara> findById(Long id) {
        return garaRepo.findById(id);
    }

    @Override
    public void save(Gara gara) {
        garaRepo.save(gara);
    }

    @Override
    public void remote(Long id) {
        garaRepo.deleteById(id);
    }
}
