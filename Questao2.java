import javax.swing.JOptionPane;

/** 
 * Essa Classe faz uma Verificação se a senha obtida atende os seguintes requisitos; 
 * Possui no mínimo 6 caracteres.
 * Contém no mínimo 1 digito.
 * Contém no mínimo 1 letra em minúsculo.
 * Contém no mínimo 1 letra em maiúsculo.
 * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 */
public class Questao2 {

    public static String validaSenha(String senha) {
        String verificaSenha = "", senhaVerificada; 
        Boolean letraMinuscula = false, letraMaiuscula = false, numero = false, caractereEspecial = false; 

        // verifica a quantidade de caracteres digitados
        if(senha.length() < 6) {
            verificaSenha = "Faltam " + (6 - senha.length()) + " caracteres";
        }

        for (char s : senha.toCharArray()) {
            if (s >= 'a' && s <= 'z') {
                letraMinuscula = true;
            } else if(s >= 'A' && s <= 'Z') {
                letraMaiuscula = true;
            } else if ( s >= '0' && s <= '9') {
                numero = true; 
            } else {
                caractereEspecial = true; 
            }       
        }

        // cria as mensagens de erros para auxiliar o usario a formar uma senha forte
        if( !letraMinuscula )    verificaSenha += "\n a senha deve conter pelo menos 1 letra minuscúla";
        if( !letraMaiuscula )    verificaSenha += "\n a senha deve conter pelo menos 1 letra maiuscula";
        if( !numero )            verificaSenha += "\n a senha deve conter pelo menos 1 número";
        if( !caractereEspecial ) verificaSenha += "\n a senha deve conter pelo menos 1 caractere especial";

        senhaVerificada = verificaSenha.length() > 0 ?  verificaSenha : "Senha Forte";

        return senhaVerificada;
    }

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, validaSenha("Ya3@lk"));
    }
}
