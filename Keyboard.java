package computer;
public class Keyboard extends ComputerModel {
Computers computers; 

public Keyboard(Computers computers){
this.computers = computers; 
}

public String getDescription() {
return computers.getDescription() + " , Keyboard";
}

public double cost() {
return 50.05 + computers.cost();
}
}
