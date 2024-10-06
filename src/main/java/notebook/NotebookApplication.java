package notebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

@SpringBootApplication
public class NotebookApplication {

	public static void main(String[] args) throws SQLException {

		/*DataControllBD x = new DataControllBD();
		x.createDbase("notes","id varchar(20), name varchar(20), text varchar(255)");*/

		String relativePath = "src/main/java/notebook/resources/NoteDBase";
		Path path = Paths.get(relativePath).toAbsolutePath();
        String url =  "jdbc:h2:file:"+ path;

		System.out.println(url);

		// Устанавливаем абсолютный путь в системную переменную окружения
		System.setProperty("DB_URL", "jdbc:h2:file:" + path);

		SpringApplication.run(NotebookApplication.class, args);
	}

}
