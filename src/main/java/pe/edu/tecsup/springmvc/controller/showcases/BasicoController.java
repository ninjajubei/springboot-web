package pe.edu.tecsup.springmvc.controller.showcases;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("basico")
public class BasicoController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "basico/index";
    }

    @RequestMapping(value = {"holamundo", "helloworld"})
    public String holaMundo() {
        return "basico/holaMundo";
    }

    @GetMapping("adiosmundo")
    public String adiosMundo() {
        return "basico/adiosMundo";
    }

    @PostMapping("pruebaPost")
    public String pruebaPost() {
        return "basico/pruebaPost";
    }

}
