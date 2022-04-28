package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto10;

@Controller
public class Punto10Controller {

    @Autowired
    Punto10 punto10;

    @GetMapping("/point10")
    public ModelAndView getPoint10(){
        String resultadoF = punto10.punto10ConWhile();
        ModelAndView modelView = new ModelAndView("punto10");
        modelView.addObject("resultadoF", resultadoF);
        return modelView;
    }
    
}
