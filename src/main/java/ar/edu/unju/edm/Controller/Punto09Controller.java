package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto09;

@Controller

public class Punto09Controller {

    @Autowired
    Punto09 punto09;

    @GetMapping("/point09")
    public ModelAndView getPoint8(){
        String resultadoF = punto09.punto09ConFor();
        ModelAndView modelView = new ModelAndView("punto09");
        modelView.addObject("resultadoF", resultadoF);
        return modelView;
    }
    
}
