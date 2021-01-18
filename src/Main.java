import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Methods {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
        Я проводив серіалізацію і десеріаліацію одразу ліста оскільки ніяких різниць між цим не має. Сподіваюсь,
        завдання я зрозумів правильно.
        */
        ArrayList<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Robert",1234532,1500));
        employeeList.add(new Employee("Drake",1341531,3200));
        employeeList.add(new Employee("Johny",9364826,2000));
        employeeList.add(new Employee("Peter",5395639,1300));


        File file = new File("Test.txt");


        writeObjectsToFile(file,employeeList);


        System.out.println(readObjectsFromFile(file));

    }
}
