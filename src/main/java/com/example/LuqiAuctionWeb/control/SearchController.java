package com.example.LuqiAuctionWeb.control;

import com.example.LuqiAuctionWeb.LuqiProduct.LuqiProduct;
import com.example.LuqiAuctionWeb.search.Search;
import com.example.LuqiAuctionWeb.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/MainPage.html")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/product")
    String show (@RequestParam("id") Long id, Model model)
    {
        LuqiProduct product = searchService.productById(id).get();
        model.addAttribute("name",product.getNameOfProduct());
        model.addAttribute("content",product.getDescription());
        model.addAttribute("id",product.getId());
        return "showproduct";

    }

    @GetMapping("/mainpage")
    String createSearch (Model model){
        model.addAttribute("search",new Search());
        System.out.println("create");
        return "MainPage.html";
    }

    @PostMapping("/mainpage")
    String getProducts(Search search, Model model){
        model.addAttribute("products",searchService.products(search));
        System.out.println("show");
        return "MainPage";
    }

}
