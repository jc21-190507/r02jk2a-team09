
public class Kadai02 {

	/**
	 * 課題02
	 * 文字列の中に、指定されたアルファベットが何文字入っているかを返すメソッド
	 * @param s 文字列
	 * @param c
	 * @return sの中に入っていたcの文字数
	 */
	int countString(String s, char c) {
		char[] str = s.toCharArray();
		int i,counter = 0;
		for(i  =  0;i < str.length ; i ++ ) {
			if(c == str[i] )
				counter++;
		}
		return counter;
	}


	}

