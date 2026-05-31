public class Gafanhoto extends Peessoa {

//Atributos

    private String login;
    private int totAssistido;

//Construtor

    public Gafanhoto(String nome, String sexo, int idade,String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

//Getters e Setters


    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

//Metodos

    @Override
    protected void ganharExp() {

    }
    public void viuMaisUm(){

    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
