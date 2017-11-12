package pe.edu.tecsup.springmvc.controller.curso;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.tecsup.springmvc.dao.CursoDAO;
import pe.edu.tecsup.springmvc.dao.ProgramaDAO;
import pe.edu.tecsup.springmvc.model.Curso;
import pe.edu.tecsup.springmvc.model.Programa;

@Service
@Transactional
public class CursoServiceImp implements CursoService {

    @Autowired
    CursoDAO cursoDAO;

    @Autowired
    ProgramaDAO programaDAO;

    @Override
    public List<Curso> allCurso() {
        return cursoDAO.list();
    }

    @Override
    public List<Programa> allPrograma() {
        return programaDAO.list();
    }

    @Override
    public Curso find(Long id) {
        return cursoDAO.get(id);
    }

    @Override
    public void save(Curso curso) {
        if (curso.getId() == null) {
            cursoDAO.save(curso);
        } else {
            cursoDAO.update(curso);
        }
    }

    @Override
    public void delete(Long id) {
        cursoDAO.delete(new Curso(id));
    }

}
