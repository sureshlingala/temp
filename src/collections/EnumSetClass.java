package collections;

import java.util.EnumSet;
import java.util.Iterator;

import org.omg.Messaging.SyncScopeHelper;

public class EnumSetClass {

	
	//its not synchronized
	//its a highly performance java collection member
	//faster than hashset
	//faster since all the method are implemented based on bitwise arithmetic operations
	
	enum Lang{
		Java,
		JavaScript,
		Ruby,
		Python
	}
	
	
	public static void main(String[] args) {
			
		//Creates new enum set
		EnumSet<Lang> langEnumRef=EnumSet.allOf(Lang.class);
		System.out.println(langEnumRef);
		
		//empty enum set
		EnumSet<Lang> langEnumRef1= EnumSet.noneOf(Lang.class);
		System.out.println(langEnumRef1);
		
		// range(e1,e2)
		EnumSet.range(Lang.Java, Lang.Ruby).stream().forEach(System.out::print);
		
		//of
		EnumSet<Lang> javalang=EnumSet.of(Lang.Java);
		System.out.println(javalang);
		
		EnumSet<Lang> javajslang=EnumSet.of(Lang.Java, Lang.JavaScript);
		System.out.println(javajslang);
		
		//add and addall
		EnumSet<Lang> langEnum=EnumSet.allOf(Lang.class);
		EnumSet<Lang> langEnum1= EnumSet.noneOf(Lang.class);
		
		langEnum1.add(Lang.Java);
		langEnum1.addAll(langEnum);
		System.out.println(langEnum1);
		
		//Iterate enumset
		EnumSet<Lang> lang=EnumSet.allOf(Lang.class);
		Iterator<Lang> itr=lang.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+ ",");
		}
		
		//remove and remove all
		EnumSet<Lang> langEnumremove=EnumSet.allOf(Lang.class);
		boolean b = langEnumremove.remove(Lang.Python);
		System.out.println(b);
		System.out.println(langEnumremove.removeAll(langEnumremove));
		System.out.println(langEnumremove);
	}	

}
