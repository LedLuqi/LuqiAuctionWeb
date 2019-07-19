package com.example.LuqiAuctionWeb.LuqiRepository;

import com.example.LuqiAuctionWeb.LuqiProduct.LuqiProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LuqiProductRepository extends JpaRepository <LuqiProduct,Long> {
    List<LuqiProduct> findByDescriptionContains(String search);
    List<LuqiProduct> findByNameOfProductContains(String search);
    Optional<LuqiProduct> findById(Long id);
}
