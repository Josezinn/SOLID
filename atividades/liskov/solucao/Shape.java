//Para solucionar o problema de Liskov, criarei uma superclasse Shape, para que as formas se extendam nela.
//Assim se for necessário, na propria classe da forma, é onde será feita alguma modificação se necessária.
//Especificando a forma do calculo da area a depender da forma por exemplo.

public abstract class Shape {
    public double getWidth();
    public double getHeight();
    public double calculateArea();
}