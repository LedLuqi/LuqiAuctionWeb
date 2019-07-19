package com.example.LuqiAuctionWeb.search;
import com.example.LuqiAuctionWeb.LuqiProduct.LuqiProduct;
import com.example.LuqiAuctionWeb.LuqiRepository.LuqiProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class SearchService {

    @Autowired
    LuqiProductRepository productRepository;

    public ArrayList<LuqiProduct> products(Search search){
        ArrayList<LuqiProduct> products = new ArrayList<>();
        products.addAll(productRepository.findByNameOfProductContains(search.getSearched()));
        products.addAll(productRepository.findByDescriptionContains(search.getSearched()));
        return products;
    }
    public Optional<LuqiProduct> productById(Long id){
        return productRepository.findById(id);
    }
}
