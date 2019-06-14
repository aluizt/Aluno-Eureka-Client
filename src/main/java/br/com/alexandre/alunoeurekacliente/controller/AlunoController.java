package br.com.alexandre.alunoeurekacliente.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @GetMapping
    public ResponseEntity<Map> listarAlunos(){

        Map<Long,String> mapa =  new HashMap<>();
        mapa.put(1l,"Alexandre");
        mapa.put(2l,"Janice");
        mapa.put(3l,"Maria Luiza");
        mapa.put(4l,"Joao");
        mapa.put(5l,"Carla");

        return ResponseEntity.ok(mapa);
    }
}
