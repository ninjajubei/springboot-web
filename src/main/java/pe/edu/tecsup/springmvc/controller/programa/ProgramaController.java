package pe.edu.tecsup.springmvc.controller.programa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/programa")
public class ProgramaController {

    @GetMapping
    public String index() {
        return "admin/programa/index";
    }

}
