package com.portfolio.back.Repository;

import com.portfolio.back.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
}