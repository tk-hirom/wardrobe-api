package com.example.wardrobeapi

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding
import org.springframework.context.annotation.Configuration



@Configuration
@EnableConfigurationProperties(AppProperties::class)
class AppPropertiesConfig

@ConfigurationProperties(prefix = "app")
data class AppProperties @ConstructorBinding constructor(val text: String)
