package pe.edu.tecsup.springmvc.controller.showcases;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("vistas")
public class VistasController {

    @GetMapping("simple")
    public String index() {
        return "vistas/index";
    }

    @GetMapping("complex")
    public ModelAndView complex() {
        return new ModelAndView("vistas/index");
    }

    @ResponseBody
    @GetMapping("body")
    public String body() {
        return "Hola, soy una respuesta en el Body";
    }

}
