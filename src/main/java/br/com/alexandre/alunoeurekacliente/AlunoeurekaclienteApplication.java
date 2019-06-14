package br.com.alexandre.alunoeurekacliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlunoeurekaclienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlunoeurekaclienteApplication.class, args);
    }

}
