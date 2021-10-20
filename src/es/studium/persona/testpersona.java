package es.studium.persona;

public class testpersona
{

	public static void main(String[] args)
	{
		Persona p1 = new Persona(); //Puedes ponerlo asi
		p1.setNombre("Oihana");
		p1.setApellidos("Mendez Villanueva");
		p1.setEdad(27);
		p1.setHaPagado(true);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellidos());
		System.out.println(p1.getEdad());
		System.out.println(p1.getHaPagado());
		
		Persona p2 = new Persona("Sofia", "Romero", 24, true); // o asi como te sea mas comodo
		System.out.println(p2.getNombre());
		System.out.println(p2.getApellidos());
		System.out.println(p2.getEdad());
		System.out.println("Sofia ha pagado");
		
		
		System.out.println(p2.getNombre() +  " " + p2.getApellidos() + "\n" + p2.getEdad() + "\n"+ p2.getHaPagado());
		
	}

}
