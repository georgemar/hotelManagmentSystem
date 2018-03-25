package javaPack;

import java.util.ArrayList;
import java.util.List;

public class Trie {
	List<Integer> pos = new ArrayList<Integer>();
	char name;
	int father;
	List<Integer> ch = new ArrayList<Integer>();

	public Trie(char n, int i, int f) {
		name = n;
		if (i != -1) {
			pos.add(i);
		}
		father = f;
	}
}
