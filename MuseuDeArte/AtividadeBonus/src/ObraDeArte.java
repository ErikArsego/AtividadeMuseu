import java.io.Serializable;

public abstract class ObraDeArte implements Serializable {
    private String titulo;
    private String artista;
    private int anoDeCriacao;
    private String localizacao;

    public ObraDeArte(String titulo, String artista, int anoDeCriacao, String localizacao
