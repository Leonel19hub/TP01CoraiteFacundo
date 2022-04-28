package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto01;

@Controller
public class Punto01Controller {
    @Autowired
    Punto01 punto01;

    @GetMapping("/punto01")
    public ModelAndView getPoint01(@RequestParam(name = "num")int num){
        punto01.setNum(num);
        String resultadoF = " "+ punto01.calcularFactorial(num);
        ModelAndView modelView = new ModelAndView("punto01");
        modelView.addObject("resultadoF", resultadoF);
        modelView.addObject("num", num);

        return modelView;
    }
}
