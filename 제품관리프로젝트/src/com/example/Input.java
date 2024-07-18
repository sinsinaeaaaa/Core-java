package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	private List<Product> list;
	private Scanner sc;
	private File file;
	
	public Input(List<Product> list) {
		this.list = list;
		this.file = new File("./productdata.txt");
		try {
		this.sc = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
	}

	public void fileInput() {
		while(this.sc.hasNextLine()) {
			String line = this.sc.nextLine();
			/*
			 * Parsing 방법
			 * 1. Scanner's split
			 * 2. Scanner useDelemiter
			 * 3. String Tokenizer
			 */
			Scanner scLine = new Scanner(line).useDelimiter("\\s+");
			Product p = new Product(scLine.next(), scLine.nextInt(), scLine.nextInt(), scLine.nextInt(), scLine.nextInt());
			this.list.add(p);
		}
	}

}
