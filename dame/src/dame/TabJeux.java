package dame;

public class TabJeux {
		private String [][]Table;
		private int  tail;
		public TabJeux() {
			this.tail=8;
			this.Table=new String [tail][tail];
		    for(int i =0;i<tail;i++) {
		    	for(int j=0;j<tail;j++) {
		    		this.Table[i][j]=".";
		    		
		    	                         }    	
		                              }
		                   }
		public String Totring() {
			String CH="";
			for(int i=0;i<tail;i++) {
				for(int j=0;j<tail;j++) {
					CH+=this.Table[i][j];
					CH+="\t";
				}
				CH+="\n \n";
			}
			return CH;
		}
		public String ToString() {
				String CH="Y:\n _________________________________________________________________ \n";
				for(int i=0;i<8;i++) {
					CH+=" |       |       |       |       |       |       |       |       |  \n"+i+"|";
					for(int j=0;j<8;j++) {
						
						CH+="  ";
						CH+=this.Table[i][j]+" ";

						CH+="\t |";
					}
					CH+="\n |_______|_______|_______|_______|_______|_______|_______|_______| \n";
							
				}
				CH+=" |   0   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |  :X \n";
				
				return CH;
			}
		public String[][] getTable() {
			return Table;
		}
		public String getT(int i,int j) {
			return Table[i][j];
		}
		public void setT(int i,int j,String s) {
			Table[i][j]=s;	
		}
		public void setTable(String[][] table) {
			Table = table;
		}


		public static void main(String[] args) {
			TabJeux T=new TabJeux();
			System.out.println(T.ToString());
		}
		
}
