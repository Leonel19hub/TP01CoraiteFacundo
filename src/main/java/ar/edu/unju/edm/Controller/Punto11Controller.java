package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto11;

@Controller
public class Punto11Controller {

    @Autowired
    Punto11 punto11;

    @GetMapping("/point11")
    public ModelAndView getPoint11(){
        String resultadoF = punto11.punto11DoWhile();
        ModelAndView modelView = new ModelAndView("punto11");
        modelView.addObject("resultadoF", resultadoF);
        return modelView;
    }
    
}
