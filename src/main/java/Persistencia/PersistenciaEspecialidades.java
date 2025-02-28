
package Persistencia;

/**
 *
 * @author Jesús Pedro Lares Velncia (00000233383) y
 */
import Entidades.Especialidad;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaEspecialidades {
    
    private List<Especialidad> especialidades;

    public PersistenciaEspecialidades() {
        this.especialidades = new ArrayList<>();
    }

    public void agregarEspecialidad(Especialidad especialidad) throws Exception {
        // Validar que el ID sea único
        for (Especialidad e : especialidades) {
            if (e.getId() == especialidad.getId()) {
                throw new Exception("Ya existe una especialidad con ID " + especialidad.getId());
            }
        }
        this.especialidades.add(especialidad);
    }

    public Especialidad obtenerEspecialidadPorId(int id) throws Exception {
        for (Especialidad e : especialidades) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new Exception("No se encontró una especialidad con ID " + id);
    }

    public List<Especialidad> listarEspecialidades() {
        return new ArrayList<>(especialidades);
    }
}

