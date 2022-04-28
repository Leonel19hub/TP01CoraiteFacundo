package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto08;

@Controller
public class Punto08Controller {

    @Autowired
    Punto08 punto08;

    @GetMapping("/point08")
    public ModelAndView getCalculoMultiplo(@RequestParam(name = "num1") int numero){
        punto08.setNum1(numero);
        String resultadoMultiplos = punto08.multiplosDeNumero();
        ModelAndView modelView = new ModelAndView("punto08");
        modelView.addObject("resultadoMultiplos", resultadoMultiplos);
        modelView.addObject("numero", numero);
        return modelView;
    }
    
}
