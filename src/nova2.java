
public class nova2 {
    public static void main(String[] args) {
        double x= 3;
        double y= 4;
        double a,b,c,delta,x1, x2;

        //RAIZ
        System.out.println("Raiz");
        a = Math.sqrt(x);
        c = Math.sqrt(25);
        System.out.println("Raiz quadrada de "+x+" é "+a);
        System.out.println("Raiz quadrada de 25 é "+c);

        //X ELEVADO a X
        System.out.println("X elevado a X");
        b = Math.pow(x,y);
        System.out.println(x+"elevado a "+y+" é "+ b);

        //Valor absoluto
        System.out.println("X elevado a X");
        a = Math.abs(x);
        b = Math.abs(y);
        System.out.println("O valor absoluto de"+x+" é "+a);
        System.out.println("O valor absoluto de"+y+" é "+b);

        //-b+- raiz de 4*a*c/2
        System.out.println("X elevado a X");
        delta = Math.pow(b,2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("O valor absoluto de"+x+" é "+a);
        System.out.println("O valor absoluto de"+y+" é "+b);
    }
}
