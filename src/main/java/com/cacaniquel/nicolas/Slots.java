package com.cacaniquel.nicolas;
// Define o pacote onde essa classe está localizada

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// Importa a classe que permite gerar números aleatórios

@RestController
// Indica que esta classe é um controlador REST (uma API que retorna dados)
public class Slots {

    // Array contendo os símbolos do caça-níquel
    String[] simbolos = {"🍒","🍋","⭐","💎","7️⃣"};

    // Objeto que gera números aleatórios
    Random random = new Random();

    @GetMapping("/spin")
    // Cria um endpoint GET acessível em: http://localhost:8080/spin
    public Map<String, Object> spin() {

        // Sorteia três símbolos aleatórios do array
        String a = simbolos[random.nextInt(simbolos.length)];
        String b = simbolos[random.nextInt(simbolos.length)];
        String c = simbolos[random.nextInt(simbolos.length)];

        // Verifica se os três símbolos são iguais (condição de vitória)
        boolean win = a.equals(b) && b.equals(c);

        // Cria um mapa que será enviado como resposta da API
        Map<String,Object> res = new HashMap<>();

        // Coloca os símbolos sorteados dentro da resposta
        res.put("slots", new String[]{a,b,c});

        // Coloca o resultado da jogada (true = ganhou, false = perdeu)
        res.put("win", win);

        // Retorna os dados em formato JSON para o frontend
        return res;
    }
}