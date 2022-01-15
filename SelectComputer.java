package computer;
public class SelectComputer {

public static void main(String args[])
{
Computers computers1=new Desktop();
computers1 = new Keyboard(computers1);

System.out.println(computers1.getDescription() + " $ " + computers1.cost());

Computers computers2=new MiniComputer();
computers2 = new Keyboard(computers2);

System.out.println(computers2.getDescription() + " $ " + computers2.cost());
}
}
