package ua.ucu.edu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.ucu.edu.demo.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
