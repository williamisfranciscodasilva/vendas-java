import javax.swing.JOptionPane;
class vendas
{
    public static void main(String args[])
    {
        float salario_fixo, vendas_mes, comissao, salario_total;

        salario_fixo = 800;
        vendas_mes = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o valor das vendas do m�s"));
        comissao = (vendas_mes / 100) * 15;
        salario_total = salario_fixo + comissao;

        JOptionPane.showMessageDialog(null,"Sal�rio Fixo: "+salario_fixo+
        "\nValor das vendas do M�s: "+vendas_mes+
        "\nComiss�o: "+comissao+
        "\nSal�rio total: "+salario_total);

        System.out.println("Sal�rio Fixo: "+salario_fixo);
        System.out.println("Valor das vendas do M�s: "+vendas_mes);
        System.out.println("Comiss�o: "+comissao);
        System.out.println("Sal�rio total: "+salario_total);
    }
}