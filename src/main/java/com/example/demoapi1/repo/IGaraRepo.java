package com.example.demoapi1.repo;

import com.example.demoapi1.model.Gara;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGaraRepo extends CrudRepository<Gara,Long> {
}
