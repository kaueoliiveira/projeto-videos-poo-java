public abstract class Peessoa {
//Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

//Construtor

    public Peessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.experiencia = 0;
        this.idade = idade;
    }


//Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

//Metodos

    protected abstract void ganharExp();

    @Override
    public String toString() {
        return "Peessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}

