public class Mago extends Personagem {
    private int pontosMana;

    public Mago(String nome, int nivel, int pontosVida, int pontosMana) {
        super(nome, nivel, pontosVida, ClassePersona.MAGO);
        setPontosMana(pontosMana);
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(int pontosMana) {
        if (pontosMana <= 0) {
            throw new IllegalArgumentException("Os pontos de mana do Mago devem ser maiores que zero.");
        }
        this.pontosMana = pontosMana;
    }

    @Override
    public String executarHabilidadeEspecial() {
        return " Bola de Fogo conjurada gastando " + pontosMana + " pontos de Mana!";
    }

    @Override
    public String exibeFicha() {
        return super.exibeFicha() + "Mana: " + pontosMana + "\n=======================================";
    }
}