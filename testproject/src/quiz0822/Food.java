package quiz0822;
import java.io.*;
import java.io.Serializable;

public class Food implements Serializable  {
	String name;
	int kcal;
	
	public Food(){
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setKcal(int kcal) {
		this.kcal=kcal;
	}
	public int getKcal() {
		return this.kcal;
	}
	
	public String toString() {
		return name+ ","+ kcal;
	}
	 public void fileSave(String fileName) {
	      try(FileOutputStream fos = new FileOutputStream(fileName); 
	         ObjectOutputStream oos = new ObjectOutputStream (fos)){
	         
	         oos.writeObject(this);
	         
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	   }

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	 
	
}
