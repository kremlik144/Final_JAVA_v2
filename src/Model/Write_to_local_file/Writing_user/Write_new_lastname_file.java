package Model.Write_to_local_file.Writing_user;

import Model.Abstract.Human;
import View.Printer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Write_new_lastname_file {
	private final String local_file = Printer.path_to_local_file;
	
	public void writex(Human user) throws IOException {
		Path file = Paths.get(this.local_file + user.getLast_name());
		try (FileWriter fileWriter = new FileWriter(file.toFile())){
			fileWriter.write(user.toString());
			fileWriter.write("\n");
			fileWriter.flush();
		} catch (IOException e) {
			throw new IOException(e.getMessage() + Printer.error_create_file + user.getLast_name());
		}
	}
}
