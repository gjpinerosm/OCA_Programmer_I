package Chapter_1.Nonaccess_Modifiers.Static_Modifiers;

public class TestEmp {

    String name;
    static int bankVault;

    public static void main(String[] args) {
        TestEmp emp1 = new TestEmp();
        TestEmp emp2 = new TestEmp();

        emp1.bankVault = 10;
        emp2.bankVault = 20;

        System.out.println(emp1.bankVault);
        System.out.println(emp2.bankVault);
        System.out.println(TestEmp.bankVault);
    }
}
