package javaPack;

public class Rbt {
	int id;
	String color;
	int left;
	int right;
	int father;
	int layer;
	int br;
	int gf;
	int pos;
	public Rbt(int x ,String cl,int l,int lef,int rig,int f,int b,int g,int p){
		id=x;
		color=cl;
		layer=l;
		left=lef;
		right=rig;
		father=f;
		br=b;
		gf=g;
		pos = p;
	}
}
