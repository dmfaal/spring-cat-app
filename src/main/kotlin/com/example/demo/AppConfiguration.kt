package com.example.demo

import com.example.demo.services.CatStorageService
import com.example.demo.services.SystemService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfiguration {
    @Bean
    fun getCatStorageService(config: AppConfigurationProps): CatStorageService {
        return CatStorageService(config.officialCats)
    }

    @Bean
    fun getSystemService(): SystemService {
        return SystemService();
    }
}