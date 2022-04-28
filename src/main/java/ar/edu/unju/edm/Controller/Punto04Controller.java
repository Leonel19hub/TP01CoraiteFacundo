package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto04;

@Controller
public class Punto04Controller {

    @Autowired
    Punto04 punto04;

    @GetMapping("/point04")
    public ModelAndView getPoint04(@RequestParam(name = "mes")int mes){
        punto04.setMes(mes);
        String resultadoF = punto04.esMesDelAnio();
        ModelAndView modelView = new ModelAndView("punto04");
        modelView.addObject("resultadoF", resultadoF);
        modelView.addObject("mes", mes);

        return modelView;

    }
    
}
