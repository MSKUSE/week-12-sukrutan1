public class Main {
    public static void main(String[] args) {

        StackLinkedList<Number> stack =new StackLinkedList<>();
        stack.push(3);
        stack.push(45);
        stack.push(3.5);
        //stack.push("This is a test");
        stack.displayStack();


        /*Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();*/
    }
}