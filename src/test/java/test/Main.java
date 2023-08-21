package test;

public class Main {

	public static void main(String[] args) {
		Asiento asiento1 = new Asiento();
				asiento1.color="amarillo";
				asiento1.precio=1000;
				asiento1.registro=1231;
		
		Asiento asiento2 = new Asiento();
				asiento2.color="amarillo";
				asiento2.precio=1000;
				asiento2.registro=1231;
				
		Motor motor1= new Motor();
				motor1.numeroCilindros=3;
				motor1.registro=1231;
				motor1.tipo="gasolina";
			
		Auto auto1= new Auto();
				auto1.asientos=new Asiento[] {asiento1,asiento2};
				auto1.marca="Toyota";
				auto1.modelo="2001";
				auto1.motor=motor1;
				auto1.precio=2000;
				auto1.registro=1231;
				
		System.out.println(auto1.verificarIntegridad());
		motor1.asignarTipo("");
		System.out.println(motor1.tipo);
		
	}

}
