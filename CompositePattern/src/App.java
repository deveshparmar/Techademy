public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alan Walker","Software Developer");
        Employee emp2 = new Employee("James Anderson","UI Designer");
        Employee emp3 = new Employee("Virat Kohli","Project Manager");

        Department development = new Department("Development");
        development.addComponent(emp1);
        development.addComponent(emp3);

        Department design = new Department("Design");
        design.addComponent(emp2);

        Department engineering = new Department("Engineering");
        engineering.addComponent(development);
        engineering.addComponent(design);

        engineering.display();

    }
}
