public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return 配列の中の降順で2番目の値
	 */
	int get2ndMax(int[] d) {

		int flag = 0;
		int loopend =1;

			while(flag == 0) {

				for(int i=0 ; i<d.length-loopend; i++) {

					if(d[i] < d[i+1]){

					int tmp = d[i];
					d[i] = d[i+1];
					d[i+1] = tmp;

					flag = 1;
					}
				}
				if(flag == 1) {
				flag = 0;
				}
				else {
				flag =1;
				break;
			}
			loopend++;

		}
		return d[1];
	}
}