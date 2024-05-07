package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith((nome))){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Contato 1", 123456);
        agendaContatos.adicionarContato("Contato 1", 0);
        agendaContatos.adicionarContato("Contato 3", 1111111);
        agendaContatos.adicionarContato("Contato 4", 1237984);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Contato 1", 123));
        agendaContatos.exibirContato();
    }
}
