package jerarquia;

public class Empleado extends Persona{
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empleado(double salario) {
		super();
		this.salario = salario;
	}

	public Empleado() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [salario=" + salario + "]";
	}
	
	public void aumentarSalario(double aumento) {
		salario += aumento;
	}
}
