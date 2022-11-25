package model;

public class Objetivo {
    String nome_Objetivo;
    String responsavel_objetivo;
    String tipo_objetivo;
    Integer valor_objetivo;
    Integer tempo_objetivo;
    Integer salario;

    public Objetivo(String nome_Objetivo, String responsavel_objetivo, String tipo_objetivo, Integer valor_objetivo, Integer tempo_objetivo, Integer salario) {
        this.nome_Objetivo = nome_Objetivo;
        this.responsavel_objetivo = responsavel_objetivo;
        this.tipo_objetivo = tipo_objetivo;
        this.valor_objetivo = valor_objetivo;
        this.tempo_objetivo = tempo_objetivo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Objetivo{" +
                "nome_Objetivo='" + nome_Objetivo + '\'' +
                ", responsavel_objetivo='" + responsavel_objetivo + '\'' +
                ", tipo_objetivo='" + tipo_objetivo + '\'' +
                ", valor_objetivo=" + valor_objetivo +
                ", tempo_objetivo=" + tempo_objetivo +
                ", salario=" + salario +
                '}';
    }
}
