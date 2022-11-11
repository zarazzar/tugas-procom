package pertemuan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertama_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("Masukkan berapa baris : ");
		int baris = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= baris;i++) {
			for(int j = 1; j <= i; j++) {
				if(i==baris) {
					System.out.print("*");
				}

				else if(j == 1 || j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}

}
