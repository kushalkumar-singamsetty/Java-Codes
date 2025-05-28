
public class forloop {

	public static void main(String[] args) {
		  int k=0;
		  char g=0;
		 for(;g<=127;g++) {
			 if(!(g>=48&&g<=57||g>=65&&g<=90||g>=97&&g<=122))
			 {
				 k++;
			 }
		 System.out.println(k);
		 }

	}

}
