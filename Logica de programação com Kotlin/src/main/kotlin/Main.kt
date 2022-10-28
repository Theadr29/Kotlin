    fun main() {


        // CONDIÇOES (CONTROLE FLUXO)
        val produto = "iPhone"

        // se, senão
        // ( <, <=, >, >= !, ==, != )
        if (produto.length <3) {
            println("Você não pode cadastrar produtos com nomes pequenos")
        }else{
            println("Produto cadastrado com sucesso!")
        }


        val produto1 = "iPhone"

        // se, senão
        if ( !(produto1.length < 3) ){
            println("Você não pode cadastrar produtos com nomes pequenos")
        } else {
            println("Produto cadastrado com sucesso!")
        }
        val preco = 20_000
        if (preco > 30_000) {
            println("Você ganhou 30 % de desconto")
        } else if (preco> 20_000) {
            println("Voçe ganhou 20% de desconto")
        } else if (preco> 10_000) {
            println("Voçe ganhou 10% de desconto")
        } else {
            println("Você não ganhou desconto")

        }
    }