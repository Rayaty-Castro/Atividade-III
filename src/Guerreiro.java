public class Guerreiro extends Personagem {
    private int força;

    public Guerreiro(String nome, int nivel, int pontosVida, int força) {
        super(nome, nivel, pontosVida, ClassePersona.GUERREIRO);
        setForça(força);
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        if (força <= 0) {
            throw new IllegalArgumentException("A força do Guerreiro deve ser um valor positivo.");
        }
        this.força = força;
    }

    @Override
    public String executarHabilidadeEspecial() {
        return " Golpe Devastador executado com força extra de " + (força * 2) + " de dano!";
    }

    @Override
    public String exibeFicha() {
        return super.exibeFicha() + "Força: " + força + "\n=======================================";
    }
}