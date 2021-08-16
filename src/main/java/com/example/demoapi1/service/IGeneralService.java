package com.example.demoapi1.service;

import org.springframework.expression.spel.ast.OpPlus;

import java.util.Optional;

public interface IGeneralService <T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remote(Long id);


}
