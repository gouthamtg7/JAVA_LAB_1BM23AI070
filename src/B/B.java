package B;
import A.A;

public class B extends A {
    public void display(){
        System.out.println("Private : "+ protecVar);
        System.out.println("Public : "+ publicVar);

    }
}
