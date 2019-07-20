package com.example.LuqiAuctionWeb.control;

import com.example.LuqiAuctionWeb.LuqiProduct.LuqiProduct;
import com.example.LuqiAuctionWeb.LuqiRepository.LuqiProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller()
public class ProductController {

    @Autowired
    LuqiProductRepository productRepository;

    @GetMapping("/saveproduct")
    String createProduct(Model model){
        LuqiProduct product = new LuqiProduct();
        model.addAttribute("advertise", product);
        return "SaveProduct.html";
    }

    @PostMapping("/saveproduct")
    String saveProductToDAO(LuqiProduct product, Model model){
        productRepository.save(product);
        return "redirect:/mainpage";
    }
}
