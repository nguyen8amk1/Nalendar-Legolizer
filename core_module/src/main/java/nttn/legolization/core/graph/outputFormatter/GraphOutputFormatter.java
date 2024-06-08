package nttn.legolization.core.graph.outputFormatter;
import nttn.legolization.core.graph.*;
import java.util.*;

public interface GraphOutputFormatter<T> {
    public String toString(Map<T, List<T>> map);
}
