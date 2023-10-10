//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore 
//scelto da te e le moltiplichi fra di loro.
public class Main {
    public static void main (String[] args){
    int first = 2;
    int second = 1;
    System.out.println(addAndMult (first, second));
}

static int addAndMult (int a ,int  b) {
    a = a + 2;
    b = b + 2;
    return a*b;
}
}
