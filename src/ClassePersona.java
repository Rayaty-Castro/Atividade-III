public enum ClassePersona {
    GUERREIRO("Guerreiro"),
    MAGO("Mago");

    private final String descricao;

    ClassePersona(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}