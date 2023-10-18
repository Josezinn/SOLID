//Para solucionar o problema de segregação, irei apenas criar outras interfaces mais específicas.
//A classe que não precisar de uma função, em vez de usar a interface Machine, usa so a que for necessária.

public interface MachineScan {
    void scan();
}