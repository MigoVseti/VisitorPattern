public class Test {
    public static void main(String[] args) {
        Element element = new ConcreteElement();
        Visitor visitor = new ConcreteVisitor();

        element.accept(visitor);
    }
}
