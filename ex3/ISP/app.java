public class app {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Ceo ceo = new Ceo();
        Employee employee = new Employee();
        manager.salary();
        manager.addBonus();
        manager.hire();
        manager.train();
        employee.salary();

        ceo.salary();
        ceo.addBonus();
        ceo.makeDecisions();
        ceo.addStocks();
    }
}
