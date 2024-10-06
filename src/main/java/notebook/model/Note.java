package notebook.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
@Table(name = "notebook")
public class Note {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long id;
    private String name;
    private String text;
}
