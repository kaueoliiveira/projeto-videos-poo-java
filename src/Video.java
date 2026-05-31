public class Video implements AcoesVideo{

//Atributos

    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

//Construtor


    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if(!this.isReproduzindo()){
            System.out.println("O video começou");
            this.setReproduzindo(true);
        }
        else{
            System.out.println("Erro,o video ja esta reproduzindo.");
        }

    }

    @Override
    public void pause() {
        if(this.isReproduzindo()){
            System.out.println("Video pausado");
            this.setReproduzindo(false);
        }
        else{
            System.out.println("Erro,o video ja esta pausado!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

//Getters e Setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        int nova;
        nova = (int) ((this.getAvaliacao() + avaliacao) / this.getViews());
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
