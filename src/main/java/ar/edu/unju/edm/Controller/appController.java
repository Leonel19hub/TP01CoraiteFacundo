package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Factorial;

@Controller
public class appController {

    @GetMapping("/home")
    public String home(){
        return "index";
    }
    
    @GetMapping("/factorialNum")
    public String calcFactorial(@RequestParam(name = "num") int num, Model model){
        int resultadoS = 0;
        Factorial fact = new Factorial();
        fact.setNum(num);
        resultadoS = fact.calcularFactorial(num);
        model.addAttribute("resultadoS", resultadoS);
        return "answer";
    }

    @GetMapping("/verificarBisiesto")
    public String verfificarBisiesto(@RequestParam(name = "anio") int anio, Model model){

        boolean resultadoS = false;

        Bisiesto esBisiesto = new Bisiesto();
        esBisiesto.setAnio(anio);

        resultadoS = esBisiesto.verificarBisiesto(anio);

        model.addAttribute("resultadoS", resultadoS);
        return"ansBisiesto";
    }
}
