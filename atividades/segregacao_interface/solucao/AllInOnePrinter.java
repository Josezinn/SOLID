//Para solucionar o problema de segregação, irei apenas criar outras interfaces mais específicas.
//A classe que não precisar de uma função, em vez de usar a interface Machine, usa so a que for necessária.

public class AllInOnePrinter implements MachinePrint, MachineScan {
    @Override
    public void print() {
        // Implementação do método print
    }

    @Override
    public void scan() {
        // Implementação do método scan
    }
}