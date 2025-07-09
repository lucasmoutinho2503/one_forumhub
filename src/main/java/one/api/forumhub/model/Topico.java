package one.api.forumhub.model;

import jakarta.persistence.*;
import lombok.*;
import one.api.forumhub.dto.TopicoDTO;

@Table(name = "topico")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String dataCriacao;
    private Boolean estadoTopico;
    private String autor;
    private String curso;

    public Topico(TopicoDTO topico) {
        this.titulo = topico.titulo();
        this.mensagem = topico.mensagem();
        this.dataCriacao = null; // Remover Null
        this.estadoTopico = true;
        this.autor = null; // Remover Null
        this.curso = topico.curso();
    }
}
