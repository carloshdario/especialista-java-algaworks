package Strings.desafioValidarEmail;

public class ValidadorEmail {

    public static boolean validar(String email) {
        if (email == null || !email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
            return false;
        }

        int arrobaUsuario = email.indexOf("@");
        int arrobaDominio = email.lastIndexOf(".");

        if (arrobaUsuario == -1 || arrobaDominio == -1 || arrobaUsuario > arrobaDominio) {
            return false;
        }

        String nomeUsuario = email.substring(0, arrobaUsuario);
        String dominio = email.substring(arrobaUsuario + 1, arrobaDominio);
        String sufixo = email.substring(arrobaDominio + 1);

        if (nomeUsuario.isEmpty() || dominio.isEmpty() || sufixo.isEmpty()) {
            return false;
        }

        for (char c : nomeUsuario.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '.' || c == '-' || c == '_')) {
                return false;
            }
        }

        for (char d : dominio.toCharArray()) {
            if (!(Character.isLowerCase(d) || Character.isDigit(d) || d == '-' || d == '.')) {
                return false;
            }
        }

        if (sufixo.length() < 2 || sufixo.length() > 3) {
            return false;
        }
        for (char s : sufixo.toCharArray()) {
            if (!(Character.isLowerCase(s))) {
                return false;
            }
        }

        return true;
    }

    //TODO Regras nome_do_usuario@dominio.com.br, nome_do_usuario nao pode ser vazio, aceita digitos, letras, mas nao aceita caracter especial - ok
    //TODO permite _, - . letra maisucula - ok
    //TODO Dominio nao pode ser vazio - e ponto sao aceitos outros caracteres nao e a apenas letra minuscula - ok
    //TODO sufixo do dominio so pode ter 2 ou 3 caracteres, aceita apenas letras

}