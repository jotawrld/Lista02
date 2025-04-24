public abstract class Produto implements Vendavel {
    protected String nome;
    protected double precoBase;
    protected int estoque;

    public Produto(String nome, double precoBase, int estoque) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    public void reduzirEstoque(int quantidade) throws Exception {
        if (quantidade > estoque) {
            throw new Exception("Estoque insuficiente para " + nome);
        }
        estoque -= quantidade;
    }

    public abstract String getDescricao();
}