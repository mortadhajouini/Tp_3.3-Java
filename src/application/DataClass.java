package application;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
private List<Person> importList;
private List<Person> exportList;

public DataClass() {
	importList= new ArrayList<Person>();
	importList.add(new Person("Mortadha","Jouini","mortadhajouinizlatan@gmail.com"));
	importList.add(new Person("Sedki","Shabou","sedkishabou@gmail.com"));
	importList.add(new Person("Rym","Bachrouch","RymBachrouch@gmail.com"));

	
}

public List<Person> getImportList() {
	return importList;
}


public List<Person> getexportList() {
	return exportList;
}

public void setexportList(List<Person> exportList) {
	this.exportList.addAll(exportList);
	for(Person p:this.exportList)
		System.out.println(p);
}





}
