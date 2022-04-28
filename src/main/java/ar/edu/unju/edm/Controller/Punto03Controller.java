package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto03;

@Controller 
public class Punto03Controller {

    @Autowired
    Punto03 punto03, punto031, punto032, punto033, punto034;

    @GetMapping("/point03")
    public ModelAndView getPoint03(@RequestParam(name = "num1") int n1, @RequestParam(name = "num2") int n2, @RequestParam(name = "num3") int n3, @RequestParam(name = "num4") int n4, @RequestParam(name = "num5") int n5){

        String resultado1 = "";
        String resultado2 = "";
        String resultado3 = "";
        String resultado4 = "";
        String resultado5 = "";

        ModelAndView modelView = new ModelAndView("punto03");

        modelView.addObject("n1", n1);
        modelView.addObject("n2", n2);
        modelView.addObject("n3", n3);
        modelView.addObject("n4", n4);
        modelView.addObject("n5", n5);

        punto03.setNumeroPar(n1);
        resultado1 = punto03.comprobraPar();
        modelView.addObject("resultado1", resultado1);

        punto031.setNumeroPar(n2);
        resultado2 = punto031.comprobraPar();
        modelView.addObject("resultado2", resultado2);

        punto032.setNumeroPar(n3);
        resultado3 = punto03.comprobraPar();
        modelView.addObject("resultado3", resultado3);

        punto033.setNumeroPar(n4);
        resultado4 = punto033.comprobraPar();
        modelView.addObject("resultado4", resultado4);

        punto034.setNumeroPar(n5);
        resultado5 = punto034.comprobraPar();
        modelView.addObject("resultado5", resultado5);

        return modelView;

    }
    
}
