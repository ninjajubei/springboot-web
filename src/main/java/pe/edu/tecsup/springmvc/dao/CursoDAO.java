package pe.edu.tecsup.springmvc.dao;

import java.util.List;
import pe.edu.tecsup.springmvc.helper.GenericDAO;
import pe.edu.tecsup.springmvc.model.Curso;

public interface CursoDAO extends GenericDAO<Curso> {

    Curso getByCodigo(String codigo);

     List<Curso> getByNombre(String nombre);
}
