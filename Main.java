public class Main{
    public static void main(String[] args){
        //Objeto Proprietario
        Garagem garagemPassagem = new Garagem(3,"Rua Campo, 20");
        Proprietario proprietario = new Proprietario("José Victor", 20, 1062251245,"Passagem-PB", garagemPassagem);

        Veiculo carro = new Veiculo("BMW","IX3M Sport", 2023);
        Cliente cliente = new Cliente("Gustavo",19, 1062255232,"Tataíra - PB",carro);

        Usuario usuario = new Usuario(cliente, "Iphone 8 plus");

        //Metodos
        cliente.buscarGaragem(garagemPassagem);
        cliente.locarGaragem(garagemPassagem,DatasDisponiveis.DIA_2);

        garagemPassagem.buscar("IX3M Sport");
        garagemPassagem.remover(carro);
        garagemPassagem.buscar("IX3M Sport");

        proprietario.ajustarData(DatasDisponiveis.DIA_2, false);
        boolean resultadoDia2 = DatasDisponiveis.DIA_2.getDia();
        System.out.println(resultadoDia2);

    }
}
