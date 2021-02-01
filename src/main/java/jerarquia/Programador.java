package jerarquia;

public class Programador extends Empleado{
	private CategoriaProgramador categoria;

	public CategoriaProgramador getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProgramador categoria) {
		this.categoria = categoria;
	}

	public Programador(CategoriaProgramador categoria) {
		super();
		this.categoria = categoria;
	}

	public Programador() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "Programador [categoria=" + categoria + "]";
	}
	
	
}
