package circunferencia;
import ponto.Ponto;
/**
 * Escreva uma descri��o da classe TestaCircunferencia aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class TestaCircunferencia
{
    public static void main(String[] args){
        Ponto p1 = new Ponto(5,5);
        Circunferencia c = new Circunferencia();
        Circunferencia cr = new Circunferencia(15.5);
        double raio = c.calcularRaio(p1);
        
        System.out.println("raio = "+raio);
        
        
    }
}
