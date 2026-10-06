public abstract class Personagem {
    private String nome;
    private int nivel;
    private int pontosVida;
    private ClassePersona classe;

    public Personagem(String nome, int nivel, int pontosVida, ClassePersona classe) {
        setNome(nome);
        setNivel(nivel);
        setPontosVida(pontosVida);
        this.classe = classe;
    }

    // Encapsulamento com validações nos setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do personagem não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1 || nivel > 100) {
            throw new IllegalArgumentException("O nível deve estar entre 1 e 100.");
        }
        this.nivel = nivel;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        if (pontosVida <= 0) {
            throw new IllegalArgumentException("Os pontos de vida devem ser maiores que 0.");
        }
        this.pontosVida = pontosVida;
    }

    public ClassePersona getClasse() {
        return classe;
    }

    // Metodo polimórfico obrigatório nas subclasses
    public abstract String executarHabilidadeEspecial();

    public String exibeFicha() {
        return """
               Nome: %s
               Classe: %s
               Nível: %d
               HP: %d
               """.formatted(nome, classe.getDescricao(), nivel, pontosVida);
    }
}