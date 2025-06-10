package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class TesteFigura {

    public static void main(String[] args) {
        // Criar os objetos (com valores iniciais 0 no construtor)
        Retangulo retangulo = new Retangulo(0, 0);
        retangulo.setBase(5);
        retangulo.setAltura(3);

        Triangulo triangulo = new Triangulo(0, 0);
        triangulo.setBase(4);
        triangulo.setAltura(6);

        Circulo circulo = new Circulo(0);
        circulo.setRaio(2.5);

        // Criar lista e adicionar os objetos
        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);

        // Mostrar descrição e área de cada figura
        for (FiguraGeometrica figura : listaFigurasGeometricas) {
            System.out.println(figura.getDescricao());
            System.out.printf("Área da figura: %.2f\n", figura.getArea());
        }
    }
}

