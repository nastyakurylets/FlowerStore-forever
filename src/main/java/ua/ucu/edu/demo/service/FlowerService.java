package ua.ucu.edu.demo.service;

import org.springframework.stereotype.Service;
import ua.ucu.edu.demo.model.Flower;
import ua.ucu.edu.demo.repository.FlowerRepository;
import java.util.List;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower createFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
}
