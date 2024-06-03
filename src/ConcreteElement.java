public class ConcreteElement implements Element{
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    public void operation() {
        System.out.println("Выполняется операция внутри ConcreteElement");
    }
}
