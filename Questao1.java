import javax.swing.JOptionPane;


/** 
 * @author Vitor Soares
 * 
 * Essa Classe retorna uma String em formato de escada de asteriscos.
 * @param numeroDegraus = Seleciona o tamanho de linhas que a String deve conter.
 */
public class Questao1 {

    public static String alturaEscada(int numeroDegraus ) {
        String str = "", saida = "";
        for(int i = 0; i < numeroDegraus; i++){
            str += "*";
            if(i == 0) {
                saida = str;
            }else{
                saida += "\n" + str ;
            }
        }
        return saida;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, alturaEscada(6));
    }

}