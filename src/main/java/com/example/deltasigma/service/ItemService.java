package com.example.deltasigma.service;

import com.example.deltasigma.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private int currentId = 1; 


    public Item addItem(Item item) {
        item.setId(currentId); 
        currentId++;           
        items.add(item);
        return item;
    }

    public Item getItemById(int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
