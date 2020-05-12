package uvsq.pglp_4_1;

import java.util.ArrayList;

public class CompositePersonnels implements GroupePersonnels {

	
	
	ArrayList<GroupePersonnels> personnes; 
	int IdGroupe;
	
	public CompositePersonnels(int id)
	{
		this.IdGroupe=id;
		this.personnes=new ArrayList<GroupePersonnels>();
	}
	public void add(GroupePersonnels groupe)
	{
		personnes.add(groupe);
	}
	
	public void remove(GroupePersonnels groupe)
	{
		personnes.remove(groupe);
	}
	
	public void print() {
		int indice=0;
		System.out.println(IdGroupe);
		while (indice<personnes.size())
		{
			personnes.get(indice).print();
			indice++;
			
		}
	}
}
