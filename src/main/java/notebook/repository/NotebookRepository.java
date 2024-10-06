package notebook.repository;

import notebook.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository extends JpaRepository<Note, Long> {
    void deleteByName(String name);

}
