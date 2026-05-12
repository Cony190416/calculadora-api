package cl.duoc.calculadora_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculadoraController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/suma")
    public int suma(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/resta")
    public int resta(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }
}