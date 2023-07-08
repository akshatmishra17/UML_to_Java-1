import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Alex");
        Personnel personnel1 = new Personnel("Rohan");
        Personnel personnel2 = new Personnel("Rahul");
        Personnel personnel3 = new Personnel("Sachin");
        Personnel personnel4 = new Personnel("Saurav");
        Personproperty property1 = new Personproperty("Hardworking");
        Personproperty property2 = new Personproperty("Sincere");
        Personproperty property3 = new Personproperty("Intelligent");
        Personproperty property4 = new Personproperty("Active");

        person.addPersonnel(personnel1);
        person.addPersonnel(personnel2);
        person.addPersonnel(personnel3);
        person.addPersonnel(personnel4);

        personnel1.addProperty(property1);
        personnel2.addProperty(property2);
        personnel3.addProperty(property3);
        personnel4.addProperty(property4);

        System.out.println(person.getName() + " has personnel:");
        List<Personnel> personnelList = person.getPersonnelList();
        for (int i = 0; i < personnelList.size(); i++) {
            Personnel personnel = personnelList.get(i);
            System.out.println(personnel.getName());
        }
        System.out.println();
        System.out.println(personnel1.getName() + " has properties:");
        List<Personproperty> propertyList1 = personnel1.getProperties();
        for (int i = 0; i < propertyList1.size(); i++) {
            Personproperty property = propertyList1.get(i);
            System.out.println(property.getName());
            System.out.println();
        }
        System.out.println(personnel2.getName() + " has properties:");
        List<Personproperty> propertyList2 = personnel2.getProperties();
        for (int i = 0; i < propertyList2.size(); i++) {
            Personproperty property = propertyList2.get(i);
            System.out.println(property.getName());
            System.out.println();
        }
        System.out.println(personnel3.getName() + " has properties:");
        List<Personproperty> propertyList3 = personnel3.getProperties();
        for (int i = 0; i < propertyList3.size(); i++) {
            Personproperty property = propertyList3.get(i);
            System.out.println(property.getName());
            System.out.println();
        }
        System.out.println(personnel4.getName() + " has properties:");
        List<Personproperty> propertyList4 = personnel4.getProperties();
        for (int i = 0; i < propertyList4.size(); i++) {
            Personproperty property = propertyList4.get(i);
            System.out.println(property.getName());
            System.out.println();
        }
    }
}