package Semestre2.Unidade5Sem2.ExRevisão;

public class Cliente {
    private String nome;
    private String email;
    private int idade;
    private double saldoCashback;
    private Cliente indicadoPor;

    public Cliente(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;

        if (this.nome == null) {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
        if (this.email == null) {
            throw new IllegalArgumentException("O e-mail não pode ser nulo.");
        }
        if (!this.email.contains("@")) {
            throw new IllegalArgumentException("O e-mail deve possuir '@'.");
        }
        if (this.idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser menor que 0.");
        }
        if (this.idade > 120) {
            throw new IllegalArgumentException("A idade máxima permitida é de 120 anos.");
        }
    }

    public Cliente(String nome, String email, int idade, Cliente indicadoPor) {
        this(nome, email, idade);
        this.indicadoPor = indicadoPor;
        if (this.indicadoPor == null) {
            throw new IllegalArgumentException("Cliente nulo é inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldoCashback() {
        return saldoCashback;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente getIndicadoPor() {
        return indicadoPor;
    }

    public boolean isMaiordeIdade() {
        if (idade >= 18) {
            System.out.println("O cliente " + nome + "é maior de idade.");
            return true;
        }
        System.out.println("O cliente " + nome + "é menor de idade.");
        return false;
    }

    public void creditarCashback(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor de crédito deve ser maior que 0.");
        } else {
            saldoCashback += valor;
            System.out.println("Foram depositados R$ " + valor + " em seu saldo de Cashback.");
        }
    }

    public void usarCashback(double valor) throws SaldoInsuficienteException {
        if (valor > saldoCashback) {
            throw new SaldoInsuficienteException(saldoCashback, valor);
        } else {
            saldoCashback -= valor;
            System.out.println("Foram utilizados R$ " + valor + " do seu saldo de Cashback.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (((Cliente) obj).getEmail().equalsIgnoreCase(email)) {
            System.out.println("Clientes iguais.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + "<" + email + ">";
    }

}
