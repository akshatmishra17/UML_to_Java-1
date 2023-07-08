import java.util.ArrayList;
import java.util.List;

public class Personnel extends Person {
    private List<Personproperty> properties;

    public Personnel(String name) {
        super(name);
        this.properties = new ArrayList<>();
    }

    public void addProperty(Personproperty property) {
        properties.add(property);
    }

    public void removeProperty(Personproperty property) {
        properties.remove(property);
    }

    public List<Personproperty> getProperties() {
        return properties;
    }
}