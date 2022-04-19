package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.EsPar;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.MesAnual;

@Controller
public class appController {

    @GetMapping("/home")
    public String home(){
        return "index";
    }
    
    // Punto 1
    @GetMapping("/factorialNum")
    public String calcFactorial(@RequestParam(name = "num") int num, Model model){
        int resultadoS = 0;
        Factorial fact = new Factorial();
        fact.setNum(num);
        resultadoS = fact.calcularFactorial(num);
        model.addAttribute("resultadoS", resultadoS);
        return "answer";
    }

    // Punto 2
    @GetMapping("/verificarBisiesto")
    public String verfificarBisiesto(@RequestParam(name = "anio") int anio, Model model){

        boolean resultadoS = false;

        Bisiesto esBisiesto = new Bisiesto();
        esBisiesto.setAnio(anio);

        resultadoS = esBisiesto.verificarBisiesto(anio);

        model.addAttribute("resultadoS", resultadoS);
        return"ansBisiesto";
    }

    // Punto 3
    @GetMapping("/verificarPar")
    public String esPar(@RequestParam(name = "num1") int n1, @RequestParam(name = "num2") int n2, @RequestParam(name = "num3") int n3, @RequestParam(name = "num4") int n4, @RequestParam(name = "num5") int n5, Model model){
        boolean resultado1 = false;
        boolean resultado2 = false;
        boolean resultado3 = false;
        boolean resultado4 = false;
        boolean resultado5 = false;

        // Codigo para que en la Vista se vea el numero ingresado
        model.addAttribute("n1", n1);
        model.addAttribute("n2", n2);
        model.addAttribute("n3", n3);
        model.addAttribute("n4", n4);
        model.addAttribute("n5", n5);

        // Verificacion del primer numero
        EsPar numPar = new EsPar();
        numPar.setNumeroPar(n1);
        resultado1 = numPar.verifacarPar(n1);
        model.addAttribute("resultado1", resultado1);

        // Verificacion del segundo numero
        EsPar num2Par = new EsPar();
        num2Par.setNumeroPar(n2);
        resultado2 = num2Par.verifacarPar(n2);
        model.addAttribute("resultado2", resultado2);

        // Verificacion del tercer numero
        EsPar num3Par = new EsPar();
        num3Par.setNumeroPar(n3);
        resultado3 = num3Par.verifacarPar(n3);
        model.addAttribute("resultado3", resultado3);

        // Verificacion del cuarto numero
        EsPar num4Par = new EsPar();
        num4Par.setNumeroPar(n4);
        resultado4 = num4Par.verifacarPar(n4);
        model.addAttribute("resultado4", resultado4);

        // Verificacion del quinto numero
        EsPar num5Par = new EsPar();
        num5Par.setNumeroPar(n5);
        resultado5 = num5Par.verifacarPar(n5);
        model.addAttribute("resultado5", resultado5);
        
        return"verificarPar";
    }

    // Punto 4
    @GetMapping("/mesDelAño")
    public String verificarMes(@RequestParam(name = "num") int num1, Model model){
        String resultadoS = "";

        model.addAttribute("num", num1);

        MesAnual esMes = new MesAnual();
        esMes.setNumMes(num1);
        resultadoS = esMes.esMesDelAnio(num1);

        model.addAttribute("resultadoS", resultadoS);

        return "mesDelAño";
    }   

    // Punto 5 -> Se utilizo la vista del punto 5, ya que es la misma pero con diferente manera de resolvre el problema
    @GetMapping("/verificarMes")
    public String verificarMes2(@RequestParam(name = "num")int num1, Model model){
        String resultadoS = "";
        model.addAttribute("num", num1);

        MesAnual otherMes = new MesAnual();
        otherMes.setNumMes(num1);
        resultadoS = otherMes.verificarMesSwitch(num1);

        model.addAttribute("resultadoS", resultadoS);

        return "mesDelAño";
    }
}
