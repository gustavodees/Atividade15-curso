package principal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double minutos = Double.parseDouble(JOptionPane.showInputDialog("Digite o os minutos utilizados neste mês:"));

        if(minutos <= 100){
            JOptionPane.showMessageDialog(null,"Valor á pagar é R$ 50.00");
        }else{
            double b =  ((minutos - 100) * 2) + 50;
            JOptionPane.showMessageDialog(null,"Valor á pagar é: " + b);

        }


    }
}