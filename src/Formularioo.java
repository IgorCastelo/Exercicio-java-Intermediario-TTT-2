public class Formularioo {

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
