package com.kscodes.services;

import com.kscodes.entities.Product;
import com.kscodes.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("productService")
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Map<String, Object>> report() {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        for (Product product : productRepository.findAll()) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("id", product.getId());
            item.put("name", product.getName());
            item.put("price", product.getPrice());
            item.put("quantity", product.getQuantity());
            item.put("categoryName", product.getCategoryName());
            result.add(item);
        }
        return result;
    }
}
