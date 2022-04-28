package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto02;

@Controller
public class Punto02Controller {
    
    @Autowired
    Punto02 punto02;

    @GetMapping("/point02")
    public ModelAndView getPoint02(@RequestParam(name = "anio")int anio){
        punto02.setAnio(anio);;
        String resultadoF = punto02.esBisiesto();
        ModelAndView modelView = new ModelAndView("punto02");
        modelView.addObject("resultadoF", resultadoF);
        modelView.addObject("anio", anio);

        return modelView;

    }
}
