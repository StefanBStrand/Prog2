package interfaces;
import java.util.List;
public interface ObjectFileHandler<T> {
    void writeObjectsToFile(List<T> objects, String filename);
    List<T> readObjectsFromFile(String filename);
}
