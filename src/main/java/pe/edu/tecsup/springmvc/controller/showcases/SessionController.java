package pe.edu.tecsup.springmvc.controller.showcases;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("session")
public class SessionController {

    @RequestMapping("basico")
    public String basico(String mensaje, HttpSession session) { 
        session.setAttribute("MENSAJE", mensaje);
        return "session/basico";
    }

    @RequestMapping("validate")
    public String validate(HttpSession session, Model model) {

        model.addAttribute("mensaje", session.getAttribute("MENSAJE"));
        return "session/validate";
    }

}
