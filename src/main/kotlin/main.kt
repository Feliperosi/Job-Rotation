fun main(args: Array<String>) {
    fun main(args: Array<String>) {


        var indice = 13
        var soma = 0
        var k = 0

        while (k < indice) {
            k++
            soma += k
        }

        println(soma)

        //  Soma Final é 91
        //-----------------------------------------------------------------------------------

        fun main() {
            val num: Int = readLine()!!.toInt()
            var a = 0
            var b = 1
            var c = 0
            var encontrado = false

            while (c < num) {
                c = a + b
                a = b
                b = c
            }

            if (c == num) {
                encontrado = true
                println("O número $num pertence à sequência de Fibonacci.")
            } else {
                println("O número $num não pertence à sequência de Fibonacci.")
            }
        }
        // ------------------------------------------------------------------------------------------------------------------

        // a) 1, 3, 5, 7, 9
        // b) 2, 4, 8, 16, 32, 64, 128
        // c) 0, 1, 4, 9, 16, 25, 36, 49
        // d) 4, 16, 36, 64, 100
        // e) 1, 1, 2, 3, 5, 8, 13
        // f) 2, 10, 12, 16, 17, 18, 19, 20

        // -------------------------------------------------------------------------------------------------------------------

        //tempo = distância / velocidade
        //
        //Para o carro, temos:
        //
        //tempo_carro = 100 km / 110 km/h = 0,909 horas
        //
        //Já para o caminhão, temos que levar em conta os pedágios, que acrescentam 5 minutos (ou 0,0833 horas) a cada um deles. Como são dois pedágios, o tempo total adicional é de 0,1666 horas. Então, o tempo total do caminhão é:
        //
        //tempo_caminhão = 100 km / 80 km/h + 0,1666 horas = 1,4166 horas
        //
        //Agora, para descobrir qual veículo está mais próximo de Ribeirão Preto, precisamos calcular a distância percorrida por cada um deles quando se encontram.
        //
        //Se o ponto de encontro é x km a partir de Ribeirão Preto, então a distância percorrida pelo carro é de (100 - x) km e a distância percorrida pelo caminhão é de x km.
        //
        //Usando a fórmula tempo = distância / velocidade, podemos calcular o tempo de viagem de cada veículo até o ponto de encontro:
        //
        //tempo_carro = (100 - x) km / 110 km/h
        //
        //tempo_caminhão = x km / 80 km/h + 0,1666 horas
        //
        //Igualando essas equações, obtemos:
        //
        //(100 - x) / 110 = x / 80 + 0,1666
        //
        //Simplificando, temos:
        //
        //8000 - 88x = 110x + 18,33
        //
        //198,33 = 198x
        //
        //x = 1 km
        //
        //Portanto, os veículos se encontram a 1 km de Ribeirão Preto. Como o carro já percorreu 99 km e o caminhão percorreu apenas 1 km, o caminhão está mais próximo de Ribeirão Preto quando eles se encontram.


        //-----------------------------------------------------------------------------------------------------------------
        val str = "Hello, world!"
        var inverted = ""

        for (i in str.length - 1 downTo 0) {
            inverted += str[i]
        }

        println(inverted)

        //------------------------------------------------------------------------------------------------------------------

    }
}