import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto("123ABC",
                "Chocolate Lacta 60% Mix de Nuts",
                12.90,
                new Fornecedor("Marco Antônio",
                        "Juiz de Fora"));

        Produto produtoClone = produto.clone();
        produtoClone.setCodigoDeBarras("456DEF");
        produtoClone.setNome("Chocolate Clonado");
        produtoClone.setPreco(8.90);

        produtoClone.getFornecedor().setNome("Oswaldo Antônio");
        produtoClone.getFornecedor().setCidade("Além Paraíba");

        assertEquals("Produto{codigoDeBarras=123ABC, nome='Chocolate Lacta 60% Mix de Nuts', preco='12.9', fornecedor=Fornecedor{nome='Marco Antônio', cidade=Juiz de Fora}'}", produto.toString());
        assertEquals("Produto{codigoDeBarras=456DEF, nome='Chocolate Clonado', preco='8.9', fornecedor=Fornecedor{nome='Oswaldo Antônio', cidade=Além Paraíba}'}", produtoClone.toString());

    }
}
