import javax.swing.JOptionPane;
class vendas
{
    public static void main(String args[])
    {
        float salario_fixo, vendas_mes, comissao, salario_total;

        salario_fixo = 800;
        vendas_mes = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o valor das vendas do mês"));
        comissao = (vendas_mes / 100) * 15;
        salario_total = salario_fixo + comissao;

        JOptionPane.showMessageDialog(null,"Salário Fixo: "+salario_fixo+
        "\nValor das vendas do Mês: "+vendas_mes+
        "\nComissão: "+comissao+
        "\nSalário total: "+salario_total);

        System.out.println("Salário Fixo: "+salario_fixo);
        System.out.println("Valor das vendas do Mês: "+vendas_mes);
        System.out.println("Comissão: "+comissao);
        System.out.println("Salário total: "+salario_total);
    }
}