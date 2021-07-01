package ar.com.ada.api.questionados.entities;

import javax.persistence.*;

@Entity
public class Pregunta {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pregunta_id")
    private Integer preguntaId;

    private String enunciado;






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


}
