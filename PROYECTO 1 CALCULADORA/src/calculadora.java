import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class calculadora{
public  static void main(String[] arg) {
	int a,b=5,d,f,y,r,t,j,u,g,o,p,q,jo,re,m;
	int resp;
	int ñ=9;
	int suma=1;
	int resta=2;
	Scanner S=new Scanner(System.in);
	Random random=new Random();
	List<Integer> numeros= new ArrayList <Integer>();
	System.out.println("Introduce el numero de variables aleatorias que deseas. ");
			b=S.nextInt();
	System.out.println("Aqui tiene sus "+b+" variables aleatorias.");
	for(int i=0;i<b;i++){numeros.add(random.nextInt(35));}
	for(int z:numeros){System.out.println(+z);}
	System.out.println("¿Desea realizar alguna operación?");
			System.out.println("Si lo desea escriba 1.");
			System.out.println("Si no lo desas pulse cualquier otra tecla.");
	resp=S.nextInt();
	if(resp!=1){System.out.println("Ya tiene sus variables gracias por usar el programa :)");}
	if(resp==1){{System.out.println("¿Que operación quiere realizar?");}
	System.out.println("Si desea realizar una suma de los numeros pulse 1");
	System.out.println("Si desea realizar una  resta de los numeros pulse 2");
	r=S.nextInt();
	if(r==1) {System.out.print("¿Cuantos  numeros desea sumar?(Máx:5)");
	q=S.nextInt();
	if(q>5) {System.out.println("Porfavor introduce un numero menor que 5");}
	else {System.out.println("¿Que numeros desea sumar?");
	if(q==2){System.out.println("Introduce el primer valor ");
	o=S.nextInt();
	System.out.println("Ahora introduce el segundo");
	j=S.nextInt();
	jo=j+o;
	System.out.println("El resultado de la suma es "+jo);}
	if(q==3){System.out.println("Introduce el primer valor ");
	o=S.nextInt();
	System.out.println("Introduce el segundo valor");
	j=S.nextInt();
	System.out.println("Introduce el tercer valor");
	m=S.nextInt();
	jo=j+o+m;
	System.out.println("El resultado de la suma es "+jo);}
	
	if(q==4){System.out.println("Introduce el primer valor ");
	o=S.nextInt();
	System.out.println("Introduce el segundo valor");
	j=S.nextInt();
	System.out.println("Introduce el tercer valor");
	m=S.nextInt();
	System.out.println("Introduce el cuarto valor");
	p=S.nextInt();
	jo=j+o+m+p;
	System.out.println("El resultado de la suma es "+jo);}
	if(q==5){System.out.println("Introduce el primer valor.");
	o=S.nextInt();
	System.out.println("Introduce el segundo valor.");
	j=S.nextInt();
	System.out.println("Introduce el tercer valor.");
	m=S.nextInt();
	System.out.println("Introduce el cuarto valor.");
	p=S.nextInt();
	System.out.println("Introducir el quinto valor.");
	u=S.nextInt();
	jo=j+o+m+p+u;
	System.out.println("El resultado de la suma es "+jo);
	}}}
	if(r==2) {System.out.print("¿Cuantos  numeros desea restar?(Máx:5)");
	q=S.nextInt();
	if(q>5) {System.out.println("Porfavor introduce un numero menor que 5");}
	else {System.out.println("¿Que numeros desea restar?");
	if(q==2){System.out.println("Introduce el primer valor ");
	o=S.nextInt();
	System.out.println("Introduce el segundo");
	j=S.nextInt();
	re=j-o;
	System.out.println("El resultado de la resta es "+re);}
	
	if(q==3){System.out.println("Introduce el primer valor ");
	o=S.nextInt();
	System.out.println("Introduce el segundo valor");
	j=S.nextInt();
	System.out.println("Introduce el tercer valor");
	m=S.nextInt();
	re=j-o-m;
	System.out.println("El resultado de la resta es "+re);}
	if(q==4){System.out.println("Introduce el primer valor ");
	o=S.nextInt();
	System.out.println("Introduce el segundo valor");
	j=S.nextInt();
	System.out.println("Introduce el tercer valor");
	m=S.nextInt();
	System.out.println("Introduce el cuarto valor");
	p=S.nextInt();
	re=j-o-m-p;
	System.out.println("El resultado de la resta es "+re);}
	if(q==5){System.out.println("Introduce el primer valor.");
	o=S.nextInt();
	System.out.println("Introduce el segundo valor.");
	j=S.nextInt();
	System.out.println("Introduce el tercer valor.");
	m=S.nextInt();
	System.out.println("Introduce el cuarto valor.");
	p=S.nextInt();
	System.out.println("Introducir el quinto valor.");
	u=S.nextInt();
	re=j-o-m-p-u;
	System.out.println("El resultado de la resta es "+re);}}}}}
}
	

