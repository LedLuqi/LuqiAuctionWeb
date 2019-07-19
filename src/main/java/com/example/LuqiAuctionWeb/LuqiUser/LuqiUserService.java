package com.example.LuqiAuctionWeb.LuqiUser;

import com.example.LuqiAuctionWeb.LuqiRepository.LuqiUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LuqiUserService {

    @Autowired
    LuqiUserRepository luqiUserRepository;

    public void addUser (LuqiUser user){
        luqiUserRepository.save(user);
    }
}
