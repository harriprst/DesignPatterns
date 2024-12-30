package Composite;

import java.util.ArrayList;
import java.util.List;

public class HeadOfDepartment implements Department{

    List<Department> departments = new ArrayList<>();

    public void addChildDepartment(Department department){
        departments.add(department);
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Head of Department");
        departments.forEach(department -> department.printDepartmentName());
    }
}
