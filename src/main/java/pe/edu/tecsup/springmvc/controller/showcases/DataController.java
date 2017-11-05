package pe.edu.tecsup.springmvc.controller.showcases;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.tecsup.springmvc.model.Persona;

@Controller
@RequestMapping("data")
public class DataController {

    @RequestMapping("query")
    public String query(String nombres, Model model) {
        model.addAttribute("nombres", nombres);
        return "data/query";
    }

    @RequestMapping("group")
    public String group(Persona persona, Model model) {
        model.addAttribute("persona", persona);
        return "data/group";
    }

    @RequestMapping("path/{elemento}")
    public String path(String elemento, Model model) {
        model.addAttribute("elemento", elemento);
        return "data/path";
    }

    @RequestMapping("post")
    public String post(Persona persona, Model model) {
        model.addAttribute("persona", persona);
        return "data/group";
    }

}
