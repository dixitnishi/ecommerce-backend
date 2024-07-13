package com.ecommerce.inventory_uservice.service;



import com.ecommerce.inventory_uservice.dto.AddInventoryRequest;
import com.ecommerce.inventory_uservice.model.Inventory;
import com.ecommerce.inventory_uservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository repository;

    public boolean isInStock(String skuCode,Integer quantity){
      return repository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
    }

    public Inventory addInventory(AddInventoryRequest inventoryDto) {
        Inventory inventory = Inventory.builder()
                .skuCode(inventoryDto.skuCode())
                .quantity(inventoryDto.quantity())
                .build();
        repository.save(inventory);
        return inventory;
    }
}
