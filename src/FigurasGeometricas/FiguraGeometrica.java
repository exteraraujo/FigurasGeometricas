package FigurasGeometricas;

public abstract class FiguraGeometrica {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // método abstrato para calcular área
    public abstract double getArea();

    // método abstrato para obter descrição
    public abstract String getDescricao();
}