package com.example.firstspring.car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;

import java.util.List;

@Configuration
public class CarConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repository){
        return args -> {
            Car mazdacx3 = new Car("CX3", "Mazda", 150, 1300, 200, 2020);
            Car bmwM3 = new Car("M3", "BMW", 450, 1500, 250, 2019);
       repository.saveAll(
               List.of(mazdacx3,bmwM3)
       );
        };
    }
}
