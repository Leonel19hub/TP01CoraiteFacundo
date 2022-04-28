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

    @GetMapping("/calculoMultiplos")
    public ModelAndView getCalculoMultiplo(@RequestParam(name = "num1") String numero){
        punto08.setNum1(Integer.valueOf(numero));
        String resultadoMultiplos = punto08.generarMultiplos();
        ModelAndView modelView = new ModelAndView("punto08");
        modelView.addObject("resultadoMultiplos", resultadoMultiplos);
        modelView.addObject("numero", numero);
        return modelView;
    }
    
}
