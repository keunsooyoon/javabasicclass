package Q2;

class G {
	int a = 3;
	static int b = 5; //공유
}
/*
 G g1 = new G();
 G g2 = new G();
 
 g1.a = 30;  30
 g1.b = 40;  40
 
 g2.a = 50;  50
 g2.b = 60;  60
 
 System.out.println(g1.a); 30
 System.out.println(g1.b); 60
 System.out.println(g2.a); 50
 System.out.println(g2.b); 60
 */
