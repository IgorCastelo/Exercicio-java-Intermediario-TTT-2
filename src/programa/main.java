package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static programa.main.Formulario.*;


public class main {
    public static class Formulario {
;

        public static boolean verificarNome(String nome) {
            return nome.matches("[A-Za-z ]+");
        }

        public static boolean verificarSobrenome(String sobrenome) {
            return sobrenome.matches("[A-Za-z ]+");
        }

        public static boolean verificarCPF(String cpf) {
            return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        }

        public static boolean verificarEmail(String email) {
            return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        }

    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String[]> dadosCadastrais = new ArrayList<>();

            String nome, sobreNome, cpf, email;

           // for (int i = 0; i < 3 ; i++) {


                System.out.print("Digite o nome: ");
                nome = scanner.nextLine();
                while (!verificarNome(nome)) {
                    System.out.print("Nome inválido. Digite novamente: ");
                    nome = scanner.nextLine();

                }

                System.out.print("Digite o sobrenome: ");
                sobreNome = scanner.nextLine();
                while (!Formulario.verificarSobrenome(sobreNome)) {
                    System.out.print("Sobrenome inválido. Digite novamente: ");
                    sobreNome = scanner.nextLine();
                }

                System.out.print("Digite o CPF (formato xxx.xxx.xxx-xx): ");
                cpf = scanner.nextLine();
                while (!verificarCPF(cpf)) {
                    System.out.print("CPF inválido. Digite novamente: ");
                    cpf = scanner.nextLine();
                }

                System.out.print("Digite o email: ");
                email = scanner.nextLine();
                while (!verificarEmail(email)) {
                    System.out.print("Email inválido. Digite novamente: ");
                    email = scanner.nextLine();
                }


                dadosCadastrais.add(new String[]{nome, sobreNome, cpf, email});
           //da }

            for (String[] dados : dadosCadastrais) {
                System.out.println("Dados Cadastrais:");
                System.out.println("Nome: " + dados[0]);
                System.out.println("Sobre nome: " + dados[1]);
                System.out.println("CPF: " + dados[2]);
                System.out.println("Email: " + dados[3]);
            }
            System.out.println("numero de contatos na lista: "+dadosCadastrais.size());

            scanner.close();
        }
    }



