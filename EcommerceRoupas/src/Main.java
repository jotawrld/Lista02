public class Main {
    public static void main(String[] args) {
        Produto camiseta = new Camiseta("Camiseta Java", 50.0, 10, "M");
        Produto calca = new Calca("Calça Jeans", 120.0, 5, "Slim");

        try {
            camiseta.reduzirEstoque(2);
            calca.reduzirEstoque(1);

            System.out.println(camiseta.getDescricao() + " - Preço final: R$" + camiseta.calcularPrecoFinal());
            System.out.println(calca.getDescricao() + " - Preço final: R$" + calca.calcularPrecoFinal());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}