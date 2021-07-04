package ar.com.ada.api.questionados.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pregunta {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pregunta_id")
    private Integer preguntaId;

    
    private String enunciado;

    @ManyToOne //join columns van donde esta FK
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Respuesta> opciones = new ArrayList<>();

    public void agregarRespuesta(Respuesta respuesta) {
        this.opciones.add(respuesta);
    } 

    public Integer getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(Integer preguntaId) {
        this.preguntaId = preguntaId;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    


}
