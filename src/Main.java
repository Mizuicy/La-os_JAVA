public class Main {
    public static void main(String[] args) {

        int n = 1;

        while(n <= 5){
            System.out.println(n);
            n += 2;
        }

    }
}

    int linha = 0;
    int coluna = 0;

        while (linha < 5) {
        System.out.println(linha);
        linha++;
        }
        while (coluna < 5) {
        System.out.println(coluna);
        coluna++;
        if (coluna > linha) {
        break;
        }
        System.out.print(coluna+1);
        }
        }
        }

/*        System.out.println(coluna+1);
        System.out.println();
        for(int linha = 0; linha < 5; linha++) {    // esse "for" inicia todo o processo, e ele vai funcionar enquanto "linha" for menor que 5

            for (int coluna = 0; coluna < 5; coluna++) {    // esse "for" inicia logo após o primeiro, ele vai rodar enquanto "coluna" for menor que 5, e só após a condição "coluna < 5" se tornar falsa que o "for" externo" vai rodar novamente

                if (coluna > linha) {    // caso a "coluna" for maior que "linha" esse "if" vai ser iniciado
                    break;     // esse break para o "for" de maneira forçada, fazendo com que o "for" externo rode novamente
                }

                System.out.print(coluna+1);  //  é responsável por printar os resultados que vemos no console
            }
            System.out.println(); //  é responsável por quebrar a linha, dando o formato de "escada" para os dados
        }
    }
}
*/