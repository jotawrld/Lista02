public class Calca extends Produto {
    private String modelo;

    public Calca(String nome, double precoBase, int estoque, String modelo) {
        super(nome, precoBase, estoque);
        this.modelo = modelo;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 1.2;
    }

    @Override
    public String getDescricao() {
        return nome + " - Modelo: " + modelo;
    }
}