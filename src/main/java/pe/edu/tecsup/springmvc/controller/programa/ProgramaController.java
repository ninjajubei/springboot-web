/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.tecsup.springmvc.controller.programa;

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
import pe.edu.tecsup.springmvc.model.Programa;

/**
 *
 * @author gdavi
 */

@Controller
@RequestMapping("admin/programa")
public class ProgramaController {
    
    @Autowired
    ProgramaService service;    
    
    
    @GetMapping
    public String index(Model model){
        
        model.addAttribute("programas", service.allPrograma());
        return "admin/programa/index";
        
    }
    
    @RequestMapping("Nuevo")
    public String nuevo(Model model){
        
        model.addAttribute("programa", new Programa());
        return "admin/programa/formulario";
    }
    
    @RequestMapping("update/{id}")
    public String update(@PathVariable Long id, Model model){
        
        Programa programa = service.find(id);
        if (programa == null) {
            return "redirect:/admin/programa";
        }
        
        model.addAttribute("programa",programa);
        return "admin/curso/formulario";
    }
    
    @RequestMapping("save")
    public String save(Programa programa, Model model){
        
        service.save(programa);
        return "redirect:/admin/programa";
        
    }
    
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id){
        
        service.delete(id);
        return "redirect:/admin/programa";
        
    }
    
}
