package notebook.model;

import lombok.Builder;
import lombok.Data;

@Data
//@Builder
public class Note {

    private String id;
    private String name;
    private String text;
}
