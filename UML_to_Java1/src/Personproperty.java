import java.util.ArrayList;
import java.util.List;

public class Personproperty {
    private String name;
    private List<Personproperty> containedProperties;

    public Personproperty(String name) {
        this.name = name;
        this.containedProperties = new ArrayList<>();
    }

    public void addContainedProperty(Personproperty property) {
        containedProperties.add(property);
    }

    public void removeContainedProperty(Personproperty property) {
        containedProperties.remove(property);
    }

    public String getName() {
        return name;
    }

    public List<Personproperty> getContainedProperties() {
        return containedProperties;
    }
}