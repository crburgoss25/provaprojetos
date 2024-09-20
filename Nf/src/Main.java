import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NotaFiscal nota = new NotaFiscal();

        int opcao;
        double novoValor;
        double simples = 0;
        double lucro = 0;
        do {
            System.out.println("1 - Cadastrar NF");
            System.out.println("2 - Listar NFs| Lucro ou Simples");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("Cadastrar NF :\n");
                    System.out.println("========= Digite a Razão Social  =========");
                    nota.setRazaosocial(sc.nextLine());

                    System.out.println("========= Digite o CNPJ  =========\n");
                    nota.setCnpj(sc.nextLine());

                    System.out.println("========= E-mail  =========\n");
                    nota.setEmail(sc.nextLine());

                    System.out.println("========= Número da NF  =========\n");
                    nota.setNumeronf(sc.nextInt());

                    sc.nextLine();
                    System.out.println("========= Data de emissão  =========\n");
                    nota.setDataemissao(sc.nextLine());

                    System.out.println("========= Descrição  =========\n");
                    nota.setServicoprestado(sc.nextLine());

                    System.out.println("========= Digite o Valor da NF =========\n");
                    nota.setValornf(sc.nextInt());

                    System.out.println("========= Digite o Regime Tributario =========\n");
                    nota.setRegimetributario(sc.nextInt());
                    sc.nextLine();
                    nota.empresaok++;
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("DIGITE PARA VER NOTAS DO SIMPLES 1 E LUCRO 2\n");
                    sc.nextLine();

                    if(nota.regimetributario == 1)
                    {
                        for (int i = 0; i < nota.empresaok; i++)
                        {
                            novoValor = nota.valornf * 6.5 / 100;
                            simples = novoValor + nota.valornf;

                            System.out.println("======= NF CADASTRADA ========");
                            System.out.println("CNPJ: " + nota.getCnpj());
                            System.out.println("RAZÃO SOCIAL: " + nota.getRazaosocial());
                            System.out.println("EMAIL: " + nota.getEmail());
                            System.out.println("Numero NF: " + nota.getNumeronf());
                            System.out.println("Data Emissão: " + nota.getDataemissao());
                            System.out.println("Descrição: " + nota.getServicoprestado());
                            System.out.println("Valor da NF: " + nota.getValornf());
                            System.out.println("Optante Simples Valor:  " + simples);
                            System.out.println("=======================================");
                            break;
                        }
                    }
                    else if(nota.regimetributario == 2)
                    {
                        novoValor = nota.valornf * 12.0 / 100;
                        lucro = novoValor + nota.valornf;

                        System.out.println("======= NF CADASTRADA ========");
                        System.out.println("CNPJ: " +  nota.getCnpj());
                        System.out.println("RAZÃO SOCIAL: " + nota.getRazaosocial());
                        System.out.println("EMAIL: " + nota.getEmail());
                        System.out.println("Numero NF: " + nota.getNumeronf());
                        System.out.println("Data Emissão: " + nota.getDataemissao());
                        System.out.println("Descrição: " + nota.getServicoprestado());
                        System.out.println("Valor da NF: " + nota.getValornf());
                        System.out.println("Optante LUCRO Valor:  " + lucro);
                        System.out.println("=======================================");
                        break;
                    }
                    else
                    {
                        System.out.println("NÃO HA NOTAS CADASTRADAS");
                    }
            }
        }while(opcao != 3);

    }
}