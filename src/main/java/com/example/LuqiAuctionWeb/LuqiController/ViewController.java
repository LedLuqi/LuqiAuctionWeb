package com.example.LuqiAuctionWeb.LuqiController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/view.html")
public class ViewController {
    @GetMapping("/view")
    String showPage (){
        return "view";
    }
}
