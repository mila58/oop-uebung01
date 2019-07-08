package ueb01;

class Palindrom {

	String s;

	static boolean istPalindrom(String s) {
		if (s.length() == 1)
			return true;

		CharStack stack = new CharStackImpl();
		char [] cs = s.toLowerCase().replaceAll(" ","").toCharArray();

		// die erste Hälfte auf den Stack legen
		int i = 0;
		for (; i < cs.length/2; i++)
			stack.push(cs[i]);


		// ungerade Länge: ignoriere Buchstaben in der Mitte
		if(cs.length % 2 == 1)
			i++;

		for (; i< cs.length; i++)
			if(stack.pop() != cs[i])
				return false;

		return true;
	}
}
