package exercíciometodos;
public class ExercícioMetodos {

    public static void main(String[] args) {
       
                //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(10, 1.6d);
        Calculadora.multiplicacao(2, 6);
        Calculadora.divisao(12, 6);
        
        
                //Mensagem
        System.out.println("Exercício Mensagem");  
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(30);
                
                //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
    
}
