package pe.edu.tecsup.springmvc.controller.curso;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.tecsup.springmvc.model.Curso;

@Controller
@RequestMapping("admin/curso")
public class CursoController {

    @Autowired
    CursoService service;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String value) {
                try {
                    setValue(new SimpleDateFormat("dd/MM/yyyy").parse(value));
                } catch (ParseException e) {
                    setValue(null);
                }
            }
        });
    }

    @GetMapping
    public String index(Model model) {

        model.addAttribute("cursos", service.allCurso());
        return "admin/curso/index";
    }

    @RequestMapping("nuevo")
    public String nuevo(Model model) {

        model.addAttribute("curso", new Curso());
        model.addAttribute("programas", service.allPrograma());
        return "admin/curso/formulario";
    }

    @RequestMapping("update/{id}")
    public String update(@PathVariable Long id, Model model) {

        Curso curso = service.find(id);
        if (curso == null) {
            return "redirect:/admin/curso";
        }
        model.addAttribute("curso", curso);
        model.addAttribute("programas", service.allPrograma());
        return "admin/curso/formulario";
    }

    @RequestMapping("save")
    public String save(Curso curso, Model model) {

        service.save(curso);
        return "redirect:/admin/curso";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {

        service.delete(id);
        return "redirect:/admin/curso";
    }

}
