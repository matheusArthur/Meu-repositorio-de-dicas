package banco.conta;

public class funcoes {

    public int num_account;
    public int password;
    public String name;
    public double i_money;
    public double w_money;

    //public funcoes (String name, double i_money, int num_account){
        //this.name = name;
        //this.i_money = i_money;
        //this.num_account = num_account;
    //}


    public void password (int password){
        this.password = password;
    }
    public void insertMoney (double i_money) {
        this.i_money += i_money;
    }

    public void withdrawMoney(double w_money) {
        this.i_money -= w_money;
        this.w_money = w_money;
    }

    public void EnterName(String name) {
        this.name = name;
    }
    public String toStingDeposit(){
        return "Name: "+ name + " | Money: " + i_money;
    }

    public String toStingWithdraw(){
        return "Name: "+ name + " | withdraw: " + w_money;
    }






}
