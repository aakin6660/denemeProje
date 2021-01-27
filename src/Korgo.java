
public class Korgo {
	
	public int KorgoPaketiHazirla(int yedikgsayisi, int ikikgsayisi, int hedefkargokg) {
		//int islem = (7*yedikgsayisi)+(2*ikikgsayisi);
		if((7*yedikgsayisi)+(2*ikikgsayisi)>hedefkargokg) {
		int sonuc=hedefkargokg % 7;
		int sayac=0;
		
	if(sonuc%2==0)	{
		for(int i=2;i<=sonuc;i=i*2) {
			if(sonuc%i==0) {
				sayac++;
			}		
		}	
		return sayac;	
		
       }
		
	else {
		return -1;
	     }
		
	   }
		else 
			return -1;
		}
}
