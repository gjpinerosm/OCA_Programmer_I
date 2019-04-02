package Chapter_1.Nonaccess_Modifiers.Abstract_Method.Person;

abstract class Person {
    private String name;
    public void displayName() {} // This isn't an abstract method. Is has an empty body {}.
    public abstract void perform(); // this is an abstract method. It isn't followed by {}.
}
