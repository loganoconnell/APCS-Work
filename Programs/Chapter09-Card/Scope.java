// Scope.java
// This program shows the logic problem that results from using two variables
// with the same name identifier, but two different scopes.
// Discuss the problem and various solutions.


public class Scope
{
    public static void main(String[] args)
    {
        Widget w = new Widget(100);
        System.out.println("Object w has " + w.getWidgets() + " widgets");
        System.out.println("It should have 100 widgets");
    }
}


class Widget
{
    private int numWidgets;

    public Widget(int numWidgets)
    {
        numWidgets = numWidgets;
    }

    public int getWidgets()
    {
        return numWidgets;
    }
    
    public void  setWidgets(int numWidgets)
    {
        numWidgets = numWidgets;        //This is a problem.
    }
}

