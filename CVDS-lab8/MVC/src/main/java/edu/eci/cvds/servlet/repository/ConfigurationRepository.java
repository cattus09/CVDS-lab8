package edu.eci.cvds.servlet.repository;

import edu.eci.cvds.servlet.model.Todo.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Long>{
    boolean existsById(String propiedadId);
    Configuration findById(String propiedadId);
}