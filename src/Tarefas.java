public class Tarefas {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefas(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        String status = concluida ? "[X]" : "[ ]";
        return status + " ID: " + id + " | " + titulo + " (" + descricao + ")";
    }
}

