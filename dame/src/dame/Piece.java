package dame;

import java.util.Scanner;

public  class Piece {
    
	private  String P22;
	private  String P11;
	private  String P1;
	private  String P2;
	private TabJeux T;
	
	public Piece() {
		this.P1="b";
		this.P2="n";
		this.P11="B";
		this.P22="N";
		this.T=new TabJeux();
	}
	public TabJeux remplire(){
		for(int i=0;i<8;i++) {
			    
				if(i%2==0) {T.setT(i,0, P1);T.setT(i,2, P1);
				            T.setT(i, 6, P2);}
				else {T.setT(i,1, P1);
				       T.setT(i, 5, P2);T.setT(i, 7, P2);}
			                  }
		                       
		
		return T;
	}
	public TabJeux remplireTest(){
		T.setT(2,2, P22);
		T.setT(1,1,P1);
		                       
		
		return T;
	}
	
	
	
	
	public void DepGauche(int i,int j) {
		if(T.getT(i, j)==".") {
		System.err.println("il n ya pas de piere dans cette position");
		}
		//deplacer les P1 gauche
		else if(T.getT(i, j)==P1||T.getT(i, j)==P11) {
		    //
			if(i==0 || j==7) { System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i-1, j+1)!=".") {System.err.println("impossible de deplacer la pierre");}
			else {if (T.getT(i, j)==P1) {T.setT(i, j, ".");T.setT(i-1, j+1, P1);}
			     else {T.setT(i, j, ".");T.setT(i-1, j+1, P11);}
			}
		}
		//deplacer les P2 gauche
		else if(T.getT(i, j)==P2 || T.getT(i, j)==P22) {
			if(i==7 ||j==0) {System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i+1,j-1)!=".") {System.err.println("impossible de deplacer la piere");}
			else {if(T.getT(i, j)==P2) {T.setT(i, j, ".");T.setT(i+1, j-1, P2);}
			else {T.setT(i, j, ".");T.setT(i+1, j-1, P22);}                
			}}
		                               
		}	
	//**********************
	public void DepGauInv(int i, int j) {
		if(T.getT(i, j)==".") {
			System.err.println("il n ya pas de piere dans cette position");
			}
		//pour P11
		if(T.getT(i, j)==P11) {
			if(i==7 ||j==0) {System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i+1,j-1)!=".") {System.err.println("impossible de deplacer la piere");}
			
			else {T.setT(i, j, ".");T.setT(i+1, j-1, P11);}                
			}
	 // pour P22
		else if(T.getT(i, j)==P22) {
		    //
			if(i==0 || j==7) { System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i-1, j+1)!=".") {System.err.println("impossible de deplacer la pierre");}
			
			     else {T.setT(i, j, ".");T.setT(i-1, j+1, P22);}
			
		}
	
	
	
	
	}
       
		
	
	
	
	//deplacer droit
	public void deplacerDroit(int i,int j) {
		if(T.getT(i, j)==".") {System.err.println("il n y a pas de piere");}
		//droit pour P1
		else if(T.getT(i,j)==P1 || T.getT(i,j)==P1) {
			if(i==7 || j==7) {System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i+1,j+1)!=".") {System.err.println("impossible de deplacer la piere");}
			else {if (T.getT(i,j)==P1) {T.setT(i, j, ".");T.setT(i+1,j+1,P1);}
			  else {T.setT(i, j, ".");T.setT(i+1,j+1,P11);}
			}}
		else {
			if(i==0 || j==0) {System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i-1, j-1)!=".") {System.err.println("impossible de deplacer la piere");}
			else {if(T.getT(i,j)==P2) { T.setT(i, j, ".");T.setT(i-1, j-1, P2);}
			else {T.setT(i, j, ".");T.setT(i-1, j-1, P22);}
			}}
	}
	//********************************
	public void DepDroiInv(int i,int j) {
		if(T.getT(i, j)==".") {System.err.println("il n y a pas de piere");}
		//poure P11
		else if( T.getT(i,j)==P11) {if(i==0 || j==0) {
			System.err.println("impossible de deplacer la piere");}
		else if(T.getT(i-1, j-1)!=".") {System.err.println("impossible de deplacer la piere");}
		else {T.setT(i, j, ".");T.setT(i-1, j-1, P11);}
		}
		//pour P22
		if(T.getT(i,j)==P22) {
			if(i==7 || j==7) {System.err.println("impossible de deplacer la piere");}
			else if(T.getT(i+1,j+1)!=".") {System.err.println("impossible de deplacer la piere");}
			  else {T.setT(i, j, ".");T.setT(i+1,j+1,P22);}
			}
		
		}
         
	
	//********************************

	//*********************************************************************************

	//***************************************************************************************
	
	
	//la methode tuer
	public void tuerGauch(int i ,int j) {
		//tuer de gauche pour P1
		//while(DoitTuer(i, j)==true) {
		if((T.getT(i, j)==P1||T.getT(i, j)==P11) && i-2>=0 && j+2<8) {
		    if((T.getT(i-1, j+1)==P2|| T.getT(i, j)==P22) && T.getT(i-2, j+2)=="." ){
		if(T.getT(i, j)==P1) { T.setT(i, j, ".");T.setT(i-1,j+1, ".");T.setT(i-2,j+2,P1);	}
		else {T.setT(i, j, ".");T.setT(i-1,j+1, ".");T.setT(i-2,j+2,P11);}                   
		}
		    
		else {System.err.println("impossible de detruire par la piere viser");}                     }
		//tuer gauch pour P2
		else if((T.getT(i, j)==P2 ||T.getT(i, j)==P22)&& i+2<8 && j-2>=0) {
			if((T.getT(i+1, j-1)==P1||T.getT(i, j)==P11) && T.getT(i+2, j-2)=="." ) {
				if(T.getT(i, j)==P2) {T.setT(i, j, ".");T.setT(i+1,j-1, ".");T.setT(i+2,j-2,P2);}
				else {T.setT(i, j, ".");T.setT(i+1,j-1, ".");T.setT(i+2,j-2,P2);}
			
				}
			else {System.err.println("impossible de tuer la piere viser");}
		
			}
		
		else {System.err.println("ERROR");}
		}
	//*********************************
	public void TuerGauchInv(int i,int j) {
		if((T.getT(i, j)==P11) && i-2>=0 && j+2<8) {
			if((T.getT(i+1, j-1)==P2||T.getT(i, j)==P22) && T.getT(i+2, j-2)=="." ) {
				 {T.setT(i, j, ".");T.setT(i+1,j-1, ".");T.setT(i+2,j-2,P11);}
			
				}			else {System.err.println("impossible de tuer la piere viser");}}
		else if((T.getT(i, j)==P22)&& i+2<8 && j-2>=0) {
			  if((T.getT(i-1, j+1)==P1|| T.getT(i, j)==P11) && T.getT(i-2, j+2)=="." ){
					
					 {T.setT(i, j, ".");T.setT(i-1,j+1, ".");T.setT(i-2,j+2,P22);} }                  
					 else {System.err.println("impossible de tuer la piere viser");}       
			  
			  }
		else {System.err.println("ERROR");}
	}
	//**********************************
	public void transforme() {for(int i=0;i<8;i++) {
		if(T.getT(i, 7)==P1) {T.setT(i, 7, P11);}
		if(T.getT(i, 0)==P2) {T.setT(i, 0, P22);}
	}}
	//**********************************
	
	//********************************************************************************

	//*******************************************************************************
	
	public void tuerDroite(int i,int j) {
		//pour P1
		if((T.getT(i, j)==P1 || T.getT(i, j)==P11 )&& i+2<8 && j+2<8) {
				    if((T.getT(i+1, j+1)==P2 || T.getT(i+1,j+1)==P22) && T.getT(i+2, j+2)=="."){
				
				    	if(T.getT(i, j)==P1) { T.setT(i, j, ".");T.setT(i+1,j+1, ".");T.setT(i+2,j+2,P1);}
				    	else {T.setT(i, j, ".");T.setT(i+1,j+1, ".");T.setT(i+2,j+2,P11);}
				}
				else {System.err.println("impossible de detruire par la piere viser");}                     }
				//tuer droite pour P2
				else if((T.getT(i, j)==P2 || T.getT(i, j)==P22)&& i-2>=0 && j-2>=0) {
					if((T.getT(i-1, j-1)==P1||T.getT(i, j)==P11) && T.getT(i-2, j-2)==".") {
						if(T.getT(i, j)==P2) {T.setT(i, j, ".");T.setT(i-1,j-1, ".");T.setT(i-2,j-2,P2);}
						else {T.setT(i, j, ".");T.setT(i-1,j-1, ".");T.setT(i-2,j-2,P22);}
					               
						}
					
					else {System.err.println("il n ya pas de piere dans cette position");}
			//	}  
	}}
	//********************
	public void TuerDroitInv(int i,int j) {
		//pour p11
		if(( T.getT(i, j)==P11 )&& i+2<8 && j+2<8) {
			
		
			if((T.getT(i-1, j-1)==P2||T.getT(i, j)==P22) && T.getT(i-2, j-2)==".") {
				{T.setT(i, j, ".");T.setT(i-1,j-1, ".");T.setT(i-2,j-2,P11);}
			     }else {System.err.println("impossible de detruire par la piere viser");} 
			}	               
		//pour p22
		else if(( T.getT(i, j)==P22 )&& i+2<8 && j+2<8) {
			 if((T.getT(i+1, j+1)==P1 || T.getT(i+1,j+1)==P11) && T.getT(i+2, j+2)=="."){
					
			    	 T.setT(i, j, ".");T.setT(i+1,j+1, ".");T.setT(i+2,j+2,P22);
			    	 }
			
		} else {System.err.println("il n ya pas de piere dans cette position");}
	}
	
	//*********************
	public boolean DoitTuer(int i,int j) {
	 if( (T.getT(i, j)==P1 && (T.getT(i+1, j+1)==P2 && T.getT(i+2, j+2)=="."))||(T.getT(i-1, j+1)==P2 && T.getT(i-2, j+2)==".")||(T.getT(i, j)==P2 &&(T.getT(i-1, j-1)==P1 && T.getT(i-2, j-2)==".")||(T.getT(i+1, j-1)==P1 && T.getT(i+2, j-2)=="."))) 
	 {return true;}
		
		return false;
	}
	
	
	
	
	public void VIctoire() {
		int x=0;
		for(int i=0;i<8;i++){
			
			for(int j=0;j<8;j++) {
			if(T.getT(i, j)==P1 ||T.getT(i, j)==P11) {x=1;}
			else  if(T.getT(i, j)==P2 || T.getT(i, j)==P22) {x=2;}
			else {}
						}
			}
		System.out.println("la victoire est pour le joueur "+x);
	 }
	
	
	
	
	public boolean FinGame() { int x=0;String s;
for(int i=0;i<8;i++){
	        for(int j=0;j<8;j++) {
	        if(T.getT(i, j)!=".") {s=T.getT(i, j);
	        	for(int k=0;k<7;k++){
	    	        for(int l=0;l<7;l++) {
	    	        	if(T.getT(k, l)!=s && T.getT(k, l)!=".") {x=1;}
	    	        }}
	        }	
	        }
	        }
		 if(x==1) {return false;}
		 else {return true;}
	 }	
	
	
	
	public void Manipuler(int i , int j ) {
		if(i<0 || i>8 || j<0  ||j>8 ) {System.err.println("ERROR");}
		else {
		Scanner sc = new Scanner(System.in); 
		boolean b=false;
		int k =0;
		
		while(k!=1 && k!=2 && k!=3 &&k!=4 && k!=11 && k!=22 && k!=33 && k!=44 &&k!=111 && k!=222 && k!=333 && k!=444 ) {
			  if(T.getT(i, j)==P1 || T.getT(i, j)==P2 || T.getT(i,j)==P11 || T.getT(i, j)==P22) {
				 System.out.println( "deplacer directe:: \n if gauche push on(1) \n  if droite push on (2) \n  turer gauch push on(3) \n droit push on(4) \n"
						 +" inverce:: \n deplacer gauche push on(11) \n deplacer  droite push on (22) \n ture gauch push on(33) \n  tuer droit push on(44)");
			 }
                     			
			k= sc.nextInt();   }
		    
		     if(k==1) {DepGauche(i, j);}
		else if(k==2) {deplacerDroit(i, j);}
		else if(k==3) {tuerGauch(i, j);}
		else if(k==4) {tuerDroite(i, j);}
		else if(k==11) {DepGauInv(i, j);} 
		else if(k==22) {DepDroiInv(i, j);}     
		else if(k==33) {TuerGauchInv(i, j);}
		else if(k==44) {TuerDroitInv(i, j);}
		
	}}
	
	
	
	
	public String ToString() {
		String CH="I:\n _________________________________________________________________ \n";
		for(int i=0;i<8;i++) {
			CH+=" |       |       |       |       |       |       |       |       |  \n"+i+"|";
			for(int j=0;j<8;j++) {
				
				CH+="  ";
				CH+=T.getT(i, j)+" ";

				CH+="\t |";
			}
			CH+="\n |_______|_______|_______|_______|_______|_______|_______|_______| \n";
					
		}
		CH+=" |   0   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |  :J \n";
		
		return CH;
	}
	
	
	public static void main(String[] args) {
		Piece P=new Piece();
		int k=1;
		System.out.println("\t \t \t      DamaGame \n ");
		P.remplire();
		//P.remplireTest();
		System.out.println(P.ToString());
		//le jeux n est pas encore terminer
		while(P.FinGame()==false) {
			
			System.out.println("choisie la piere sous forme : ligne colone ");
			Scanner s=new Scanner(System.in);
			int i=s.nextInt();
			int j=s.nextInt();
			P.Manipuler(i, j);
			P.transforme();
			System.out.println(P.ToString());
			k++;
			
		}
		P.VIctoire();
	System.out.println("nombre de toure de cette partie est"+k);
	}
}

