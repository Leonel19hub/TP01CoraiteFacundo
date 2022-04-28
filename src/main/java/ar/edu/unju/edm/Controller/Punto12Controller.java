package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto12;

@Controller
public class Punto12Controller {
    
    @Autowired
    Punto12 punto12;

    @GetMapping("/point12")
    public ModelAndView getPoint12(@RequestParam(name = "altura") double altura){
        punto12.setAltura(altura);
        String mensaje = "";
        String resultadoFinal = punto12.calculoTiempo();

        ModelAndView modelView = new ModelAndView("punto12");

        if(altura > 0){
            mensaje = "segundos";
            modelView.addObject("resultadoFinal", resultadoFinal);
            modelView.addObject("altura", punto12.getAltura());
            modelView.addObject("mensaje", mensaje);
        }
        else{
            resultadoFinal = "La altura debe ser mayor a 0";
            mensaje = "metros";
            modelView.addObject("resultadoFinal", resultadoFinal);
            modelView.addObject("mensaje", mensaje);
        }


        return modelView;
    }
}
