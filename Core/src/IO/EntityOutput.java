package IO;

import java.io.IOException;

public interface EntityOutput {

    public void writePerson(Person person) throws IOException;

    public void writePoint(Point person) throws IOException;
}
