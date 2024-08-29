package ar.edu.unlam.pb2.dominio;

public class SalaDeCine {
	private Butaca[][]butacas ;
	
	public SalaDeCine() {
		this.butacas = new Butaca[10][5];
		this.inicializarSala();
	}
	public void inicializarSala() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(this.butacas[i][j]==null) {
					this.butacas[i][j] = new Butaca();
				}
			}
		}
	}

	public Integer obtenerNroDeButacas() {
		// TODO Auto-generated method stub
		Integer contador =0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(this.butacas[i][j]!=null) {
				    contador++;
				}
			}
		}
		return contador;
	}

	public Integer obtenerNroDeFilas() {
		// TODO Auto-generated method stub
		Integer contador =0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(this.butacas[i][j]!=null) {
				    contador++;
				}
			}
		}
		
	return contador;
	}
	

}
