package com.boj.problem.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1000 {
	static int A, B;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
		System.out.println(sb.toString());
	}

}
