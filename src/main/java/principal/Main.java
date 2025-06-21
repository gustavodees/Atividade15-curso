package principal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o os minutos utilizados neste mês:"));

        if(a <= 100){
            JOptionPane.showMessageDialog(null,"Valor á pagar é R$ 50.00");
        }else{
            double b =  ((a - 100) * 2) + 50;
            JOptionPane.showMessageDialog(null,"Valor á pagar é: " + b);

        }


    }
}