public class Cliente extends Pessoa{
    //Atributos
    private Veiculo veiculo;

    //Construtor
    public Cliente(String nome, int idade, int cpf, String endereco, Veiculo veiculo) {
        super(nome, idade, cpf, endereco);
        this.veiculo = veiculo;
    }

    //Getters e Setters
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    //Metodos
    public String buscarGaragem(Garagem garagem){
        System.out.println("Localização: " + garagem.getLocalizacao());
        System.out.println("Quantidades de vagas: " + garagem.getQtdVagas());
        return garagem.getLocalizacao();
    }
    public boolean locarGaragem(Garagem garagem, DatasDisponiveis dia){
        garagem.adicionar(veiculo);
        dia.setDisponivel(false);
        System.out.println("Locada com sucesso!");
        return dia.getDia();
    }
}
