import java.util.ArrayList;

public class Gladiador extends Lutador {
	ArrayList<Armadura> armaduras; 
	ArrayList<Arma> armas;
	
    	
	public Gladiador() {				
		super("Gladiador sem nome " +sequencialNome++);
		armaduras = new ArrayList<>();
		armaduras.add(new Armadura("Armadura de Corpo", 0.5,1));
		
		armas = new ArrayList<>();		
		
		Arma espada =new Arma("Escalibur");
		espada.addGolpe("Ataque frontal", 50);
		espada.addGolpe("Ataque Lateral", 40);
		armas.add(espada);
	
	}


	public void addArmadura(ArrayList<Armadura> armaduras) {
		this.armaduras.addAll(armaduras);
	}
	

	public void addArma(ArrayList<Arma> armas) {
		this.armas.addAll(armas);
	}
