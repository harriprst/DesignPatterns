package Composite;

public class Mn {
    public static void main(String[] args) {
        HeadOfDepartment head = new HeadOfDepartment();

        head.printDepartmentName();

        head.addChildDepartment(new PhysicsDepartment());
        head.addChildDepartment(new MathsDepartment());

        head.printDepartmentName();
    }
}
