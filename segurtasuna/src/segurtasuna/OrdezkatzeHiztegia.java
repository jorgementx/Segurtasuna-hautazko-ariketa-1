package segurtasuna;

import java.util.HashMap;

public class OrdezkatzeHiztegia {
	
	
	private String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";
	private HashMap<Character, Character> enkItzul= new HashMap<Character, Character>();
	private HashMap<Character, Character> desenkItzul= new HashMap<Character, Character>();

	
	public static void main (String[] args){
		OrdezkatzeHiztegia nireMain = new OrdezkatzeHiztegia();
		String mezua="KAIXO MUNDUA!";
		System.out.println(nireMain.zifratu(mezua));
		System.out.println(nireMain.deszifratu(nireMain.zifratu(mezua)));
	}
	
	public OrdezkatzeHiztegia(){
		char letra = 'A';
		for (int i = 0; i < gakoa.length(); i++) {
			desenkItzul.put(gakoa.charAt(i), letra);
			enkItzul.put(letra, gakoa.charAt(i));
			letra++;
		}
	}
	
	public String zifratu(String mezua){
		String emaitza="";
		for (int i = 0; i < mezua.length(); i++) {
			if (enkItzul.containsKey(mezua.charAt(i))){
				emaitza += enkItzul.get(mezua.charAt(i));	
			}
			else{
				emaitza += mezua.charAt(i);
			}
		}
		return emaitza;
	}
	
	public String deszifratu(String kripto){
		String emaitza="";
		for (int i = 0; i < kripto.length(); i++) {
			if (enkItzul.containsKey(kripto.charAt(i))){
				emaitza += desenkItzul.get(kripto.charAt(i));
			}
			else{
				emaitza += kripto.charAt(i);
			}
		}
		return emaitza;
	}
	
}
