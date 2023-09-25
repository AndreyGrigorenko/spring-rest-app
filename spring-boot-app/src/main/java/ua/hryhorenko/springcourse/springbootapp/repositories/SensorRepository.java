package ua.hryhorenko.springcourse.springbootapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.hryhorenko.springcourse.springbootapp.models.Sensor;

import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, String> {
  Optional<Sensor> findByName(String name);
}
