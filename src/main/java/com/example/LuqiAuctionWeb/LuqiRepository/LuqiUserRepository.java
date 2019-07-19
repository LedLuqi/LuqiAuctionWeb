package com.example.LuqiAuctionWeb.LuqiRepository;
import com.example.LuqiAuctionWeb.LuqiUser.LuqiUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LuqiUserRepository extends JpaRepository <LuqiUser, Long> {
    Optional<LuqiUser> findLuqiUserByLuqilogin(String username);
}
