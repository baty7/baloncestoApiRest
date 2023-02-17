package com.example.baloncestoapirest.modelo.dao;

import com.example.baloncestoapirest.modelo.pojos.Equipos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquiposDAO extends CrudRepository<Equipos,Integer> {


}
