package com.ecommerce.inventory_uservice.controller;


import com.ecommerce.inventory_uservice.dto.AddInventoryRequest;
import com.ecommerce.inventory_uservice.model.Inventory;
import com.ecommerce.inventory_uservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean inStock(@RequestParam String skuCode, @RequestParam Integer quantity){
        return service.isInStock(skuCode,quantity);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Inventory addInventory(@RequestBody AddInventoryRequest addInventoryRequest){
        return service.addInventory(addInventoryRequest);
    }

}
