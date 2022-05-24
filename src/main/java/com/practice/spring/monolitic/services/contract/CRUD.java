package com.practice.spring.monolitic.services.contract;

import com.practice.spring.monolitic.dto.SimpleCRUDResponseDTO;

import java.util.List;

public interface CRUD<R, T> {
    T findById(Long id);
    List<T> findAll();
    SimpleCRUDResponseDTO save(R dto);
    SimpleCRUDResponseDTO update(Long id, R dto);
    SimpleCRUDResponseDTO deleteById(Long id);
}
