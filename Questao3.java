import java.util.ArrayList;
import javax.swing.JOptionPane;

/** 
 * Essa Classe Retona a quantidade de Subtring pares, que uma palavra anagrama contém.
 */
public class Questao3 {

    public static int anagramasPares(String palavra ) {
        char[] anagramas = palavra.toCharArray(); // Separando as letras
        ArrayList<Integer> saida = new ArrayList<Integer>(); // Saida final 
        ArrayList<String> subStrings = new ArrayList<String>(); // Guardando as subtrings que são pares
        int cont = 1;
    
        // percorrendo a String letra por letra
        for( int i = 0; i < palavra.length(); i++) {
            for(int j = i+1; j < palavra.length(); j++) { 
                // Obtendo as letras que são pares
                if(anagramas[i] == anagramas[j]) {  
                    saida.add(cont); 
                    cont++;
                    subStrings.add(Character.toString(anagramas[i]));
                    subStrings.add(Character.toString(anagramas[j]));
                    // Verificando o intervalo dos indices das letras pares, caso o intervalo seja maior que 1 então existe caracteres entre letras iguais, sendo assim logo teremos subtrings pares.
                    if(j - i > 1) { 
                        saida.add(cont++);
                        subStrings.add(subStringPares(palavra, i, j));
                        subStrings.add(subStringPares(palavra, i+1, j+1));
                        
                    }
                }
            }
        }

        return saida.size();
    }

    
    /** 
     * Concatenado os carcteres para formar uma subtring.
     * @param palavra = Palavra Anagrama.
     * @param numInial = indice da primeira letra par 
     * @param numFinal = indice da última palavra par
     * @return String = retorna uma sub string com os caracteres pares concatenados
     */ 
    public static String subStringPares(String palavra, int numInial, int numFinal) { 
        String subStringPar = "";
        char[] c = palavra.toCharArray();
        for(int i = numInial; i < numFinal; i++){
            subStringPar += Character.toString(c[i]);
        }
        return subStringPar;
    }

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, anagramasPares("ifailuhkqq"));
    }

}