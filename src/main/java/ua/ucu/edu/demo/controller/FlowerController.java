package ua.ucu.edu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.ucu.edu.demo.model.Flower;
import ua.ucu.edu.demo.service.FlowerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/flower")
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerService.createFlower(flower);
    }
}
