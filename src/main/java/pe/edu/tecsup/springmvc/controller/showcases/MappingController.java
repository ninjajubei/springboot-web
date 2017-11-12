package pe.edu.tecsup.springmvc.controller.showcases;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mapping")
public class MappingController {

    @GetMapping
    public String index() {
        return "mapping/index";
    }

    @GetMapping("listado")
    public String listado() {
        return "mapping/listado";
    }

    @GetMapping("save")
    public String save() {
        return "mapping/save";
    }

    @GetMapping("parametro")
    public String parametro(String nombre, Model model) {
        
        model.addAttribute("nombre", nombre);
        return "mapping/parametro";
    }

    @GetMapping("rest/{elemento}")
    public String rest(@PathVariable String elemento, Model model) {
       
        model.addAttribute("elemento", elemento);
        return "mapping/rest";
    }
}
