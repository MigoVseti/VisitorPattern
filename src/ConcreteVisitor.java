public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ConcreteElement element){
        System.out.println("Посетитель посещает элемент");
        element.operation();
    }
}
