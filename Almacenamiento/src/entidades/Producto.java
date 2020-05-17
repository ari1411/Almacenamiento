package entidades;

public class Producto {
	private int id;
	private int categoriaId;
	private int subCategoriaId;
	private int detalle;
	private int marcaId;
	private int tamanoId;
	private int rubroId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
	public int getSubCategoriaId() {
		return subCategoriaId;
	}
	public void setSubCategoriaId(int subCategoriaId) {
		this.subCategoriaId = subCategoriaId;
	}
	public int getDetalle() {
		return detalle;
	}
	public void setDetalle(int detalle) {
		this.detalle = detalle;
	}
	public int getMarcaId() {
		return marcaId;
	}
	public void setMarcaId(int marcaId) {
		this.marcaId = marcaId;
	}
	public int getTamanoId() {
		return tamanoId;
	}
	public void setTamanoId(int tamanoId) {
		this.tamanoId = tamanoId;
	}
	public int getRubroId() {
		return rubroId;
	}
	public void setRubroId(int rubroId) {
		this.rubroId = rubroId;
	}
}
