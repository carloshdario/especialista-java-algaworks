package collectionFramework.desafioListas;
import java.util.*;

public class CadastroPacoteViagem {

    private List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);

        if(pacotes.contains(descricao)){
            throw new PacoteExistenteException("Pacote ja existente.");
        }

        pacotes.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {

        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {

        Collections.sort(pacotes, new PrecoComparator().reversed().thenComparing(Comparator.naturalOrder()));
    }

    public void removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem> iterator = pacotes.iterator();

        while (iterator.hasNext()) {
            PacoteViagem pacote = iterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                iterator.remove();
                removido = true;
            }
        }
        if (!removido) {
            throw new PacoteNaoRemovidoException("Não removeu nenhum pacote com a descrição: " + descricao);
        }
    }


    public PacoteViagem buscarPorDescricao(String descricao) {

        for(PacoteViagem pacoteViagem : pacotes){
            if(pacoteViagem.getDescricao().equals(descricao)){
                return pacoteViagem;
            }
        }

         throw new PacoteNaoEncontradoException("Pacote" + descricao + " nao encontrado");
    }

}