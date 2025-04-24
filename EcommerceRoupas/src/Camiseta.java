public class Camiseta extends Produto {
    private String tamanho;

    public Camiseta(String nome, double precoBase, int estoque, String tamanho) {
        super(nome, precoBase, estoque);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 1.1;
    }

    @Override
    public String getDescricao() {
        return nome + " - Tamanho: " + tamanho;
    }
}