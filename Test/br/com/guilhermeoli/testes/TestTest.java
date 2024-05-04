package br.com.guilhermeoli.testes;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestTest {

    @Test
    public void main() {
        List<PessoaTest> lista = new PessoaTest().populaPessoas();

        ArrayList<PessoaTest> array = lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toCollection(ArrayList::new));
                array.forEach(System.out::println);
        Assert.assertEquals("Feminino", "Feminino");

    }


}