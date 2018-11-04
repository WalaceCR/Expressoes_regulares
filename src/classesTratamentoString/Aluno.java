package classesTratamentoString;

public class Aluno {
	
	private String nome;
    private String sobrenome;
    private String telefone;
    private int idade;
    private String email;
    
    public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void exibirAluno(boolean validado) {
		String textoValida = "Validado";
		if (!validado) {
			textoValida = "Inválido";
		}
		System.out.println("Nome: " + getNome() + " " + textoValida);
    }
	
    public boolean validarAluno(Aluno aluno) {
    	//Eis a expressão regular
    	//Estou concatenando o resultado de multiplos booleans, se um retornar false, não vai validar o Aluno
    	return aluno.getNome().matches("[A-Z][a-z]{1,}") && 
    			aluno.getSobrenome().matches("[A-Z][a-z]{1,}") &&
    			//valida telefone por exemplo (11) 95228-7165
    				aluno.getTelefone().matches("^(\\(11\\) [9][0-9]{4}-[0-9]{4})|(\\(1[2-9]\\) [5-9][0-9]{3}-[0-9]{4})|(\\([2-9][1-9]\\) [5-9][0-9]{3}-[0-9]{4})$") && 
    					//valida email
    					aluno.getEmail().matches("^\\w*(\\.\\w*)?@\\w*\\.[a-z]+(\\.[a-z]+)?$");
    }

}
