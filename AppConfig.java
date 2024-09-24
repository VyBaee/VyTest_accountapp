package org.example.accountdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PlayerInfo playerInfo() {
        return new PlayerInfo(1, "yvntvy", "Vy Xinh");
    }

}
