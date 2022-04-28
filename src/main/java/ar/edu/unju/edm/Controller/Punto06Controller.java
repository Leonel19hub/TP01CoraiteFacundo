package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto06;

@Controller
public class Punto06Controller {

    @Autowired
    Punto06 punto06;

    @GetMapping("/point06")
    public ModelAndView getPoint06(@RequestParam(name = "nota")int nota){
        punto06.setNota(nota);;
        String resultadoF = punto06.verificarNota();
        ModelAndView modelView = new ModelAndView("punto06");
        modelView.addObject("resultadoF", resultadoF);
        modelView.addObject("nota", nota);

        return modelView;

    }
    
}
