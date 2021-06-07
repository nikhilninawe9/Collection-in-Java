package Set;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	// Not Synchronised so performance is very fast
	// Faster than hashset
	// faster coz all the method implemented using bitwise-arithmatic operations

	enum Lang {
		JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY
	}

	public static void main(String[] args) {
		// Creating enumset using enum
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);// [JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY]

		// Create empty enum
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);// []

		// range(e1,e2)
		EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.PYTHON);
		System.out.println(enumRange);// [JAVA, CSHARP, JAVASCRIPT, PYTHON]

		// of:
		EnumSet<Lang> rubyEnum = EnumSet.of(Lang.RUBY);
		System.out.println(rubyEnum);

		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVASCRIPT, Lang.RUBY);
		System.out.println(multipleEnum);

		// add & addAll
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);// ENum of Lang
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);// Empty enum of lang

		lang2.add(Lang.JAVASCRIPT);
		lang2.addAll(lang1);
		System.out.println(lang2);// [JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY]

		// How to iterate enumset
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullLang.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// remove() and removeall()
		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println(newLang);

		boolean b = newLang.remove(Lang.CSHARP);
		System.out.println(b);// true

		boolean b1 = newLang.removeAll(newLang);
		System.out.println(b1);// true
		System.out.println(newLang);// []

	}

}
