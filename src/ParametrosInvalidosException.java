
public class ParametrosInvalidosException extends Exception{
    private int num1;
    private int num2;
    public ParametrosInvalidosException(int num1,int num2){
        super();
        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public String toString(){
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
