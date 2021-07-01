package ar.com.ada.api.questionados.entities;

import javax.persistence.*;

@Entity
public class Respuesta {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "respuesta_id")
    private Integer respuestaId;

    private String texto;






    public Integer getRespuestaId() {
        return respuestaId;
    }

    public void setRespuestaId(Integer respuestaId) {
        this.respuestaId = respuestaId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
