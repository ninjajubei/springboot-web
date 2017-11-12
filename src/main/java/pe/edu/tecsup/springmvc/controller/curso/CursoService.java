package pe.edu.tecsup.springmvc.controller.curso;

import java.util.List;
import pe.edu.tecsup.springmvc.model.Curso;
import pe.edu.tecsup.springmvc.model.Programa;

public interface CursoService {

    List<Curso> allCurso();

    List<Programa> allPrograma();

    Curso find(Long id);

    void save(Curso curso);

    void delete(Long id);

}
