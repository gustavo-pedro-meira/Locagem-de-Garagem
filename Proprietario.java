public class Proprietario extends Pessoa{
    //Atributos
    private Garagem garagem;

    //Construtor
    public Proprietario(String nome, int idade, int cpf, String endereco, Garagem garagem) {
        super(nome, idade, cpf, endereco);
        this.garagem = garagem;
    }

    //Getters e Setters
    public Garagem getGaragem() {
        return garagem;
    }
    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    //Metodos
    public boolean ajustarData(DatasDisponiveis dia, boolean alterar){
        dia.setDisponivel(alterar);
        System.out.println("Data atualizada!");
        return alterar;
    }
}
