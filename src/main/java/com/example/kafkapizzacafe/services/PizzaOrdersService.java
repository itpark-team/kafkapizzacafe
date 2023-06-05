package com.example.kafkapizzacafe.services;

import com.example.kafkapizzacafe.models.PizzaOrder;
import com.example.kafkapizzacafe.utils.Randomizer;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PizzaOrdersService {
    private Gson gson;
    private KafkaTemplate<String, String> kafkaTemplate;

    public void create(PizzaOrder pizzaOrder) {
        pizzaOrder.setId(Randomizer.getInt(1, 10000000));

        String pizzaOrderAsJson = gson.toJson(pizzaOrder);

        kafkaTemplate.send("pizza_tg_queue", pizzaOrderAsJson);
    }
}
