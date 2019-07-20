package com.example.LuqiAuctionWeb.control;

import com.example.LuqiAuctionWeb.LuqiEncoder.LuqiEncoder;
import com.example.LuqiAuctionWeb.LuqiUser.LuqiUser;
import com.example.LuqiAuctionWeb.LuqiUser.LuqiUserService;
import com.example.LuqiAuctionWeb.search.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/RegisterUser.html")
public class RegisterUserController {

    @Autowired
    LuqiUserService luqiUserService;

    @Autowired
    LuqiEncoder luqiEncoder;

    @GetMapping("/registeruser")
    String createSearch (Model model){
        model.addAttribute("user",new LuqiUser());
        System.out.println("create");
        return "registeruser";
    }

    @PostMapping("/registeruser")
    String getProducts(LuqiUser luqiUser){
        String password = luqiEncoder.getbCryptPasswordEncoder().encode(luqiUser.getLuqipassword());
        luqiUser.setLuqipassword(password);
        luqiUserService.addUser(luqiUser);
        return "redirect:mainpage";
    }
}
