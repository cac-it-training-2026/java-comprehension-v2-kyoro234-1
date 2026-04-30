package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {

	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */
			
		private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		public String inputString() throws IOException {
			//TODO ここから実装する
			String line = br.readLine();
			return(line==null)?"":line;
		

		
	}

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		String input = inputString();
		int number =Integer.parseInt(input);
		return 0;

	}

}
